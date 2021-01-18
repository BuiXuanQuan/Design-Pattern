package Order;

import Chef.Chef;

public class MakeBread implements Icommand {
    Chef chef;
    MakeBread(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excuted() {
        chef.makeBread();
    }
}
