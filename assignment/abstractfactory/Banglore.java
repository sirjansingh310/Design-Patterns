package assignment.abstractfactory;

public class Banglore extends BangloreFactory implements City {
    public void getFares(){
        Mini m = new Mini("banglore");
        m.printFares();
        Micro micro = new Micro("banglore");
        micro.printFares();
        Sedan sedan = new Sedan("banglore");
        sedan.printFares();
        SUV suv = new SUV("banglore");
        suv.printFares();
    }
}
