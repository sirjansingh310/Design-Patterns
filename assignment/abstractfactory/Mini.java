package assignment.abstractfactory;
public class Mini implements Cab{
    private String city;
    Mini(String city)
    {
        this.city = city;
    }

    @Override
    public void printFares() {
        if(city.equals("hyderabad"))
            System.out.println("Mini: Rs 7/km");
        else if (city.equals("banglore"))
            System.out.println("Mini: Rs 8/km");
        else
            System.out.println("Mini: Rs 8.5/km");
    }
}
