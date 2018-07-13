package assignment.abstractfactory;

public class Sedan implements Cab{
    private String city;
    Sedan(String city){
        this.city = city;
    }

    @Override
    public void printFares() {
        if(city.equals("banglore"))
            System.out.println("Sedan: Rs 13/km");
        else
            System.out.println("Sedan: Rs 12/km");
    }
}
