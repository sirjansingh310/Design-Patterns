package assignment.builder;

public class SubBuilder {
        private String breadType;
        private int breadCost;
        private String saladType;
        private int saladCost;
        private String sauceType;
        private int sauceCost;
        private String addonsType;
        private int addonsCost;

    public String getBreadType() {
        return breadType;
    }

    public int getBreadCost() {
        return breadCost;
    }

    public String getSaladType() {
        return saladType;
    }

    public int getSaladCost() {
        return saladCost;
    }

    public String getSauceType() {
        return sauceType;
    }

    public int getSauceCost() {
        return sauceCost;
    }

    public String getAddonsType() {
        return addonsType;
    }

    public int getAddonsCost() {
        return addonsCost;
    }

    public SubBuilder setBread(String bread){
            Bread b = new Bread(bread);
            this.breadType = bread;
            this.breadCost = b.getBreadCost();
            return this;

        }
    public SubBuilder setSalad(String salad){
        Salad s = new Salad(salad);
        this.saladType = salad;
        this.saladCost = s.getSaladCost();
        return this;

    }
    public SubBuilder setSauce(String sauce){
            Sauce s = new Sauce(sauce);
            this.sauceType = sauce;
            this.sauceCost = s.getSauceCost();
            return this;
    }
    public SubBuilder setAddons(String addons){
            Addons a = new Addons(addons);
            this.addonsType = addons;
            this.addonsCost = a.getAddonsCost();
            return this;
    }
    public Sub build(){
            return new Sub(this);
    }
}
