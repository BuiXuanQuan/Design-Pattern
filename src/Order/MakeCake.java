package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeCake implements Icommand {
    Chef chef;
    MakeCake(Chef chef){
        this.chef = chef;
    }


    @Override
    public void excuted() {
        // TODO Auto-generated method stub
        chef.makeCake();
    }
}
