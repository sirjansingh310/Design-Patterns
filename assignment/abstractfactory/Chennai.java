package assignment.abstractfactory;

public class Chennai extends ChennaiFactory implements City {
    @Override
    public void getFares()
    {
        Micro micro = new Micro("chennai");
        micro.printFares();
        Mini mini = new Mini("chennai");
        mini.printFares();
        Sedan sedan = new Sedan("chennai");
        sedan.printFares();

    }
}
