package Order;

import Chef.Chef;
import Order.Icommand;

public class MakePizza implements Icommand {
    Chef chef;
    MakePizza(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makePizza();
    }
}
