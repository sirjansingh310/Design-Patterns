
public class ExtraCheeseDecorator extends ToppingsDecorator{

	ExtraCheeseDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return "extra cheese " + pizza.getDescription();
	}

	@Override
	public double getCost() {
		return 2.5 + pizza.getCost();
	}

}
