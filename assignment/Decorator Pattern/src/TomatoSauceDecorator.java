
public class TomatoSauceDecorator extends ToppingsDecorator{

	TomatoSauceDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return "extra tomato sauce " + pizza.getDescription();
	}

	@Override
	public double getCost() {
		return 1.5 + pizza.getCost();
	}

}
