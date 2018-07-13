package assignment.builder;

public class Sauce {
    private String sauceType;
    private int sauceCost;
    Sauce(String sauceType){
        this.sauceType = sauceType;
        if(sauceType.equalsIgnoreCase("bbq"))
            sauceCost = 10;
        else if(sauceType.equalsIgnoreCase("mustard"))
            sauceCost = 5;
        else
            sauceCost = 7;
    }

    public int getSauceCost() {
        return sauceCost;
    }
}
