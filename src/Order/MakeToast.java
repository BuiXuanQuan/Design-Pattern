package Order;

import Chef.Chef;
import Order.Icommand;

public class MakeToast implements Icommand {
    Chef chef;
    MakeToast(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeToast();
    }
}
