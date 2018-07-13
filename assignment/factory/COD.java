package assignment.factory;

public class COD implements Payment{
    private int amount;
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean process() {
        if (amount >= 50000) {
            System.out.println("You can't purchase this product with COD. Only products below RS 50000 are eligible for" +
                    "Cash on Delivery");
            return false;
        } else {
            System.out.println("Your product will be delivered in 3-4 business days");
        }
        return true;
    }
    @Override
    public void printAcknowledgement() {
        System.out.println("Thank you for shopping at amazon. Here is your purchase summary\n" +
                "Payment mode: COD\n"+"Price: "+(amount));
    }
}
