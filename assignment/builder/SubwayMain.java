package assignment.builder;

import java.util.Scanner;

public class SubwayMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Subway");
        System.out.println("Three breads to choose from:\n" + "Garlic: $10\n" + "Flatbread: $20\n" + "Italian: $30");
        System.out.print("Enter bread type: ");
        String bread = sc.nextLine();
        System.out.println("Two salads to choose from:\n"+"Subway Club Salad: $20\n"+"Subway Special Salad: $25");
        System.out.print("Enter salad type: ");
        String salad = sc.nextLine();
        System.out.println("Three sauces to choose from:\n"+"BBQ: $10\n"+"Mustard: $5\n"+"Red Chilli: $7");
        System.out.print("Enter sauce type: ");
        String sauce = sc.nextLine();
        System.out.print("Would you like to customize your order with add-ons?[Yes/No]");
        String option = sc.nextLine();
        String addons = "No add-on choosen";
        if(option.equalsIgnoreCase("yes")) {
            System.out.println("3 Add-ons to choose from\n" + "Red Onions: $2\n" + "Olives: $2\n" + "Spinach: $2");
            System.out.print("Enter one or more add-ons: ");
            addons = sc.nextLine();
        }
        Sub sub = new SubBuilder().setBread(bread).setSalad(salad).setSauce(sauce).setAddons(addons).build();
        System.out.println(sub);

    }
}
