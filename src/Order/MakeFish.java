package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeFish implements Icommand {
    Chef chef;
    MakeFish(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeFish();
    }
}
