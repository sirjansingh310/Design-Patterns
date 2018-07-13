package assignment.observer;

import java.util.Scanner;

public class XEIndiaMain {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Indain Rupees:");
        double indianRupee = sc.nextDouble();
        IndianRupeePublisher rupeeVal = new IndianRupeePublisher();
        USD usd = new USD(rupeeVal);
        GBP gbp = new GBP(rupeeVal);
        Euro euro = new Euro(rupeeVal);
        rupeeVal.setValue(indianRupee);
    }
}
