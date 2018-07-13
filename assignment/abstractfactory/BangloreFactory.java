package assignment.abstractfactory;

public class BangloreFactory extends CityAbstractFactory {
    public Banglore getCity(){
     return new Banglore();
    }
}
