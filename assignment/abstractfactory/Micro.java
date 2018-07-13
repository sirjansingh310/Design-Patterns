package assignment.abstractfactory;

public class Micro implements Cab {
    private String city;;
    Micro(String city)
    {
        this.city = city;
    }
    public void printFares() {
        if(city.equals("hyderabad"))
            System.out.println("Micro: Rs 10/km");
        else if (city.equals("banglore"))
            System.out.println("Micro: Rs 11/km");
        else
            System.out.println("Micro: Rs 10.5/km");
    }
}
