package assignment.factory;
import java.util.Scanner;
public class NetBanking implements Payment{
    private int amount;
    Scanner sc = new Scanner(System.in);
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean process() {
        System.out.println("Enter your bank account number");
        String number = sc.next();
        if(number.length()<10)
        {
            System.out.println("Invalid account number");
            return false;
        }
        System.out.println("An OTP is sent to your registered phone number... please enter the OTP to continue");
        int otp = sc.nextInt();
        System.out.println("Login Success!");
        System.out.println("Transaction complete.... your product will be delivered in 3-4 business days..");
        return true;
    }

    @Override
    public void printAcknowledgement() {
        System.out.println("Thank you for shopping at amazon. Here is your purchase summary\n" +
                "Payment mode: Net Banking\n"+"Price: "+(amount));
    }
}
