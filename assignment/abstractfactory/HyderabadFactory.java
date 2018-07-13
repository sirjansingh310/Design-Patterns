package assignment.abstractfactory;

public class HyderabadFactory extends CityAbstractFactory{
    public Hyderabad getCity(){
        return new Hyderabad();
    }
}
