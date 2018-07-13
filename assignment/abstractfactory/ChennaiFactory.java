package assignment.abstractfactory;

public class ChennaiFactory extends CityAbstractFactory {
    @Override
    public City getCity() {
        return new Chennai();
    }
}
