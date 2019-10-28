
public class SimplePizza implements Pizza{

	@Override
	public String getDescription() {
		return "simple pizza ";
	}

	@Override
	public double getCost() {
		return 20;
	}
	
}
