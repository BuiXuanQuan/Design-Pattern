package Chef;

public class ChefQuynh extends Chef{
    public ChefQuynh(String name) {
        super(name);
    }
    // only chefQuynh can make this order
    public void makePizza() {
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
}
