package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeEgg implements Icommand {
    Chef chef;
    MakeEgg(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
      chef.makeEgg();
    }
}
