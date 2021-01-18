package Chef;

import java.util.ArrayList;

public class Chef {
    public void makeBread(){};

    public void makeEgg(){};
    public void makeFish(){};
    public void makePizza(){};
    public void makeHamburger(){};
    public void makeSteak(){};
    public void makeToast(){};

    String name;


    public Chef() {}
    public Chef(String name) {
        this.name = name;
    }
    ArrayList<Integer> listChefmake = new ArrayList<>();
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getDefaultCanMake(){
        ArrayList<Integer> defaultList= new ArrayList<>();
        defaultList.add(1);
        defaultList.add(4);
        defaultList.add(9);
        defaultList.add(7);
        return defaultList;
    }
    public  ArrayList<Integer> getCanMake(){

        return listChefmake;
    }
    public void setCanMake(int ...list) {
        for(int i: list) {
            this.listChefmake.add(i);
        }
    }
    //món ăn các đầu bếp đều biết đã làm xong
    public void makeCake() {
        if(Kitchen.ingrediantOfCake==0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant \n");

        }else {
            System.out.print(this.getName()+" has done cake\n");
            Kitchen.ingrediantOfCake --;
        }
    }
    public void makeChicken() {
        if(Kitchen.ingrediantOfChicken == 0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant \n");

        }else {

            System.out.print(this.getName()+" has done kitchen\n");
            Kitchen.ingrediantOfChicken -- ;
        }
    }

    public void makeCoffee() {
        if(Kitchen.ingrediantOfCoffe==0) {
            System.out.print(this.getName()+" Kitchen : dont have enough ingrediant \n");

        }else {
            System.out.print(this.getName()+" has done Coffee\n");
            Kitchen.ingrediantOfCoffe --;
        }
    }

}
