package assignment.observer;

import java.util.ArrayList;
import java.util.List;

public class IndianRupeePublisher implements Subject {
    double value;
    List<Observer> currencies;
    IndianRupeePublisher(){
        currencies = new ArrayList<>();
    }

    public void convert(double value){
        this.value = value;
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        currencies.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
       int index = currencies.indexOf(observer);
       currencies.remove(index);
    }

    @Override
    public void notifyObservers() {
         for(Observer o : currencies){
           o.update(value);
         }
         displayObservers();
    }
    public void displayObservers(){
        for(Observer o: currencies)
        {
            o.display();
        }
    }
}
