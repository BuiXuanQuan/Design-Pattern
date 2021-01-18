package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeChicken implements Icommand {

    Chef chef;
    MakeChicken(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeChicken();
    }
}
