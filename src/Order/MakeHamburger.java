package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeHamburger implements Icommand {
    Chef chef;
    MakeHamburger(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeHamburger();
    }
}
