package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeSteak implements Icommand {
    Chef chef;
    MakeSteak(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeSteak();
    }
}
