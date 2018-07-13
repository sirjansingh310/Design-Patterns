package assignment.factory;

public class PaymentFactory {
    Payment p = null;
    String mode ;
    PaymentFactory(String mode) {
        this.mode = mode;
    }
    public Payment makePayment(){
        if(mode.equalsIgnoreCase("credit card"))
            return new CreditCard();
        else if(mode.equalsIgnoreCase("debit card"))
            return new DebitCard();
        else if(mode.equalsIgnoreCase("net banking"))
            return new NetBanking();
        else if(mode.equalsIgnoreCase("cod"))
            return new COD();
        else if(mode.equalsIgnoreCase("amazon e-wallet"))
            return new Ewallet();
        return null;
    }
}
