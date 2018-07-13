package assignment.builder;


public class Bread {
        private String breadType;
        private int breadCost;
        Bread(String breadTypetype){
            this.breadType = breadTypetype;
            if(breadType.equalsIgnoreCase("garlic"))
                breadCost = 10;
            else if (breadType.equalsIgnoreCase("flatbread"))
                breadCost= 20;
            else
                breadCost = 30;
        }

    public String getBreadType() {
        return breadType;
    }

    public int getBreadCost() {
        return breadCost;
    }
}
