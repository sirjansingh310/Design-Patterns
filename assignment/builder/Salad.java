package assignment.builder;

public class Salad {
    private int saladCost;
    private String saladType;
    Salad(String saladType){
        this.saladType = saladType;
        if(saladType.equalsIgnoreCase("subway club salad"))
            saladCost = 20;
        else
            saladCost = 25;
        }

    public int getSaladCost() {
        return saladCost;
    }
}
