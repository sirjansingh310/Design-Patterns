package assignment.factory;
import java.util.Scanner;
public class PaymentsMain {
    public static void main(String args[]){
        System.out.println("Welcome to Payments India Payment gateway... Complete your amazon purchase here:\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("We accept transactions in following ways:\n"+"Credit Card\n"+"Debit Card\n"+"Net Banking\n"+"Amazon E-wallet\n"+"COD\n"+"Enter payment method");
        String mode = sc.nextLine();
        PaymentFactory factory = new PaymentFactory(mode);
        Payment pay = factory.makePayment();
        if(pay!=null) {
            System.out.println("Enter the amount");
            int amount = sc.nextInt();
            pay.setAmount(amount);
            boolean success = pay.process();
            if (success) {
                pay.printAcknowledgement();
            } else {
                System.out.println("Please try again");
            }
        }
        else{
            System.out.println("Invalid Payment method entered.. Please try again");
        }

    }
}
