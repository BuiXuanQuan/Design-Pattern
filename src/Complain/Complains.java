package Complain;

public abstract class Complains {
    protected Complains nextComplain;

    public void setNextComplain(Complains nextComplain) {
        this.nextComplain = nextComplain;
    }

    public abstract void executeComplain(int level);
}
