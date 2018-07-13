package assignment.factory;

public interface Payment {
    public void setAmount(int amount);
     public boolean process();
     public void printAcknowledgement();
}
