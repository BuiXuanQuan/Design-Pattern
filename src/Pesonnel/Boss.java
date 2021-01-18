package Pesonnel;

import Complain.Complains;

public class Boss extends Complains {
    private static Boss boss;

    // using singleton
    public static Boss getInstance() {
        if(boss ==null) {
            boss= new Boss();
        }
        return boss;
    }


    @Override
    public void executeComplain(int level) {
        if(level==3) {
            System.out.print("Pesonnel.Boss: Sorry for our service!\n");
        }else if(this.nextComplain!=null) {
            this.nextComplain.executeComplain(level);
        }
    }
}
