import Chef.Chef;
import Chef.ChefQuan;
import Chef.ChefQuynh;

import Chef.ManagerChef;
import Complain.Complains;
import MenuFood.MenuFood;
import Order.Icommand;
import Order.OrderFood;
import Pesonnel.Boss;
import Pesonnel.Manager;
import Pesonnel.Waitress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init menu object
        MenuFood menu = new MenuFood();
        menu.initListFoodMenu();
        // init waitress object
        Waitress waitress = new Waitress();
        // Option
        int option = 0;
        int numberChosen = 0;


        //Cheff
        ManagerChef manage = new ManagerChef();
        Chef chef1 = new ChefQuan("Bui Xuan Quan");
        Chef chef2 = new ChefQuynh("Pham Quynh");
        manage.addChef(chef1);
        manage.addChef(chef2);

        // Create Order
        OrderFood orderFood = new OrderFood(manage);


        // Compalain with mistake
        Complains manager = Manager.getInstance();
        Complains director = Boss.getInstance();
        waitress.setNextComplain(manager);
        manager.setNextComplain(director);


 //=========================================================================//
        Scanner scanner = new Scanner(System.in);
        while(true) {//khách đến liên tục
            //show message that customer see first
            menu.showMessage();
            System.out.println("----- Please pick one of the choice -----------\n");
            int x = scanner.nextInt();
            switch(x) {
                case 1: {
                    //show menu for customer choice
                    menu.showMenu();
                    do {
                        System.out.println("Please choose the food , choose 0 to exit!\n");
                        option = scanner.nextInt();
                        if(option ==0||option<0||option>menu.getListFood().size()) break;
                        else {
                            //add order to bill
                            Icommand order = orderFood.getOrder(option);
                            waitress.waitressAddOrder(order);
                            numberChosen++;
                        }
                    }
                    while(option!=0);
                    if(numberChosen!=0) waitress.excuteBill();
                    else System.out.print("Thank for being here\n");
                    System.out.println("------------------------------");
                    break;
                }
                case 2: {
                    //Handle the complain from custommer
                    menu.showComplainChoice();
                    System.out.println("Please choice the option\n");
                    int complainChoice = scanner.nextInt();
                    waitress.executeComplain(complainChoice);
                    break;
                }
                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}
