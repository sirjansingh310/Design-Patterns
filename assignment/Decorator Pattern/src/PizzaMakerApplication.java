
public class PizzaMakerApplication {
	public static void main(String[] args) {
		Pizza pizza = new TomatoSauceDecorator(new ExtraCheeseDecorator(new SimplePizza()));
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
