package assignment.abstractfactory;

public class SUV  implements Cab{
    private String city;
    SUV(String city){
        this.city = city;
    }

    @Override
    public void printFares() {
        if(city.equalsIgnoreCase("hyderabad"))
            System.out.println("SUV: Rs15/km");
        else
            System.out.println("SUV: Rs17/km");
    }
}
