package assignment.observer;

public class Euro implements Observer {
    double value;
    Euro(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(double value) {
        this.value = value;
    }

    @Override
    public void display() {
        System.out.printf("Euro :%.2f\n",value/69);
    }
}
