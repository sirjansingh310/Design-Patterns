
public abstract class ToppingsDecorator implements Pizza{
	Pizza pizza;
	
	ToppingsDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
}
