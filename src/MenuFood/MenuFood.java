package MenuFood;

import java.util.ArrayList;
import java.util.List;

public class MenuFood {
    private List<String> listFood   = new ArrayList<>();

    // Thêm  1 list food
    public void initListFoodMenu(){
        listFood.add("Menu : Order Bread");
        listFood.add("Menu : Order Cake");
        listFood.add("Menu : Order Chicken");
        listFood.add("Menu : Order Egg");
        listFood.add("Menu : Order Fish");
        listFood.add("Menu : Order Hamburger");
        listFood.add("Menu : Order Steak");
        listFood.add("Menu : Order Toast");
        listFood.add("Menu : Order Pizza");
        listFood.add("Menu : Order Coffee");
    }

    //
    public List<String> getListFood(){
        return  this.listFood;
    }

    //add to the list food
    public void addListFoodMenu(String food) {
        listFood.add(food);
    }
    //remove all the food in list list
    public void clearListFoodMenu() {
        listFood.clear();
    }
    //get food name
    public String getFoodName(int index) {
        return listFood.get(index);
    }
    //take list menu
    public void showMenu() {
        int i=0;
        for(i=0;i<listFood.size();i++) {
            System.out.println((i+1)+":"+listFood.get(i));
        }
    }
    public void showMessage() {
        System.out.println("1. Order food form waitress");
        System.out.println("2. Complain about food");
    }
    public void showComplainChoice() {
        System.out.println("1. Your service is not good");
        System.out.println("2. Your food is dirty");
        System.out.println("3. Food is not compatible for health");
        System.out.println("4. Attitude do not suitable to this service");
        System.out.println("5. The price is insanely expensive  than I thought  ");
    }
}
