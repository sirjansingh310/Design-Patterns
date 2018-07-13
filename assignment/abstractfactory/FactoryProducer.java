package assignment.abstractfactory;

public class FactoryProducer {
    public static CityAbstractFactory getFactory(int choice){
        if(choice==1)
            return new HyderabadFactory();
        else if(choice==2)
            return new BangloreFactory();
        else
            return new ChennaiFactory();
    }
}
