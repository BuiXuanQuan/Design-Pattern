package Pesonnel;

import Complain.Complains;

public class Manager extends Complains {
    private static Manager manager;

    // using singleton
    public static Manager getInstance() {
        if(manager ==null) {
            manager= new Manager();
        }
        return manager;
    }



    @Override
    public void executeComplain(int level) {
        if(level==2) {
            System.out.print("Manager: Sorry for our service!\n");
        }else if(this.nextComplain!=null) {
            this.nextComplain.executeComplain(level);
        }
    }
}
