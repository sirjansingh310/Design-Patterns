package assignment.factory;
import java.util.Scanner;
public class Ewallet implements Payment{
    private int amount;
    Scanner sc = new Scanner(System.in);
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean process() {
        System.out.println("Enter email id which is registered with your Amazon E-Wallet");
        String email = sc.nextLine();
        if(email.contains("@") && email.indexOf("@")>0 && email.indexOf("@")!=email.length()-1){
            System.out.println("OTP is sent to your email "+email);
            System.out.println("Enter the OTP");
            String otp = sc.next();
            System.out.println("Transaction complete.... your product will be delivered in 3-4 business days..."+
            amount+" rupees deducted from your e-wallet");
            return true;
        }
        else
        {
            System.out.println("Invalid email id");
            return false;
        }

    }

    @Override
    public void printAcknowledgement() {
        System.out.println("Thank you for shopping at amazon. Here is your purchase summary\n" +
                "Payment mode: Amazon E-wallet\n"+"Price: "+(amount));
    }
}

