package assignment.builder;

public class Sub {
    private String bread;
    private String salad;
    private String sauce;
    private String addons;
    private int total;
    public Sub(SubBuilder sb){
        bread =  sb.getBreadType();
        salad = sb.getSaladType();
        sauce = sb.getSauceType();
        addons = sb.getAddonsType();
        total += sb.getBreadCost();
        total += sb.getSaladCost();
        total += sb.getSauceCost();
        total += sb.getAddonsCost();
    }
    public String toString(){
        return "Thank you for choosing subway\n"
                +"Your sub contains : \n"
                +"bread: "+bread+"\nsalad: "+salad+"\nsauce: "+sauce +"\nadd-ons: "+addons+
                "\n Your total cost is: $"+Integer.toString(total);
    }
}
