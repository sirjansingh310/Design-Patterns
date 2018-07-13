package assignment.abstractfactory;
import java.util.Scanner;
public class utooCabMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to utoo cab service india pvt ltd\n" + "We operate in the following cities\n" +
                "\n 1) Hyderabad\n 2) Banglore\n 3)Chennai\n");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice>=1 && choice<=3){
                CityAbstractFactory cityFactory = FactoryProducer.getFactory(choice);
                City city = cityFactory.getCity();
                city.getFares();
        }
    else{
            System.out.println("Invalid Input. Please try again\n");
        }

    }
}
