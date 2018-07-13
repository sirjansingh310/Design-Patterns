package assignment.abstractfactory;

public class Hyderabad extends HyderabadFactory implements City{
    @Override
    public void getFares() {
        Mini m = new Mini("hyderabad");
        m.printFares();
        Micro micro = new Micro("hyderabad");
        micro.printFares();
        SUV suv = new SUV("hyderabad");
        suv.printFares();
    }
}
