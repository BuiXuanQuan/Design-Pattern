package Chef;

import javafx.scene.paint.Material;

import java.util.ArrayList;

public class ChefQuan extends Chef{
    public ChefQuan(String name) {
        super(name);
    }
    // only chefQuan can make this order
    public void makeHamburger() {
        if(Kitchen.ingrediantOfHamburger == 0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant\n");

        }else {
            System.out.print(this.getName()+" has done Egg\n");
            Kitchen.ingrediantOfHamburger --;

        }
    }
    // two chefs  can make  2 orders
    public void makeCoffee() {
        if(Kitchen.ingrediantOfCoffe==0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant \n");

        }else {
            System.out.print(this.getName()+" has done Coffee\n");
            Kitchen.ingrediantOfCoffe --;
        }
    }

    public void makeEgg() {
        if(Kitchen.ingredianOfEgg==0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant \n");

        }else {
            System.out.print(this.getName()+" has done Egg\n");
            Kitchen.ingredianOfEgg --;
        }
    }
// only this chef can make
    public ArrayList<Integer> getCanMake() {
        this.setCanMake(2,1,3,5);
        ArrayList<Integer> list= super.getDefaultCanMake();
        list.addAll(listChefmake);
        return list;
    }
}
