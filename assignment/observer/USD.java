package assignment.observer;

public class USD implements Observer {

    double value;
    USD(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(double value) {
        this.value = value;
    }

    @Override
    public void display() {
        System.out.printf("USD :%.2f\n",value/65);
    }
}
