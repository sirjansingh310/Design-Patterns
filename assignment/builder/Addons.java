package assignment.builder;

public class Addons {
    private int addonsCost = 0;
    private String addonsType;
    Addons(String addonsType){
        this.addonsType = addonsType.toLowerCase();
        if(addonsType.contains("red onions"))
            addonsCost+=2;
        if(addonsType.contains("olives"))
            addonsCost+=2;
        if(addonsType.contains("spinach"))
            addonsCost+=2;
    }

    public int getAddonsCost() {
        return addonsCost;
    }
}
