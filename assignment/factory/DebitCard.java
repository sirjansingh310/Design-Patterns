package assignment.factory;
import java.util.Scanner;
public class DebitCard implements Payment{
    private int amount;
    Scanner sc = new Scanner(System.in);
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean process() {
        System.out.println("Enter card holder name");
        String name = sc.nextLine();
        System.out.println("Enter your Credit card number");
        String number = sc.nextLine();
        if(number.length()!=12) {
            System.out.println("Invalid card number");
            return false;
        }
        System.out.println("Enter expiry month");
        int month=sc.nextInt();
        if(month<1 || month>12) {
            System.out.println("Invalid month entered");
            return false;
        }
        System.out.println("Enter expiry year");
        int year = sc.nextInt();
        String cvv;
        System.out.println("Enter CVV");
        cvv = sc.next();
        if(cvv.length()!=3){
            System.out.println("Invalid CVV");
            return false;
        }
        System.out.println("Processing your transaction ....");
        System.out.println("Enter the otp sent to your mobile number");
        String otp = sc.next();
        System.out.println("Transaction successful.. your product will be delivered in 3-4 business days");
        return true;

    }

    @Override
    public void printAcknowledgement() {
        System.out.println("Thank you for shopping at amazon. Here is your purchase summary\n" +
                "Payment mode: Debit Card\n"+"Price: "+(amount));
    }
}
