package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeCoffee implements Icommand {
    Chef chef;
    MakeCoffee(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
          chef.makeCoffee();
    }
}
