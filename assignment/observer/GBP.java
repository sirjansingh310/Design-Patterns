package assignment.observer;

public class GBP implements Observer {

    double value;
    GBP(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(double value) {
        this.value = value;
    }

    @Override
    public void display() {
        System.out.printf("GBP :%.2f\n",value/80);
    }
}
