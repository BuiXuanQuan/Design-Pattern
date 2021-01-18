package Pesonnel;

import Complain.Complains;
import Order.Icommand;

import java.util.ArrayList;
import java.util.List;

public class Waitress extends Complains {

 List<Icommand> billOrder = new ArrayList<>();


    public void waitressAddOrder(Icommand icommand){
        System.out.println("Your order was adding in bill order");
        billOrder.add(icommand);

    }


    public void excuteBill() {
        System.out.print("Show order to kitchen for Chefs to cook\n");

        for(Icommand order : billOrder) {
            order.excuted();
        }

        billOrder.clear();
    }

    public void waitressUpdateOrder(boolean status) {
        if(status == true) {
            System.out.print("Waitress order for customer !\n");
        }else  {
            System.out.print("Waitress sorry for running out of food ! \n");
        }
        System.out.print("-->> \n");
    }



    @Override
    public void executeComplain(int level) {
        if(level==1) {
            System.out.print("Waitress: Sorry for our service!\n");
        }else if(this.nextComplain!=null) {
            this.nextComplain.executeComplain(level);
        }
    }
}
