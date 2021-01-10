package pattern.decorator;

public class Crema extends DecoratorCafe {

	public Crema(Cafe cafeDecorat) {
		super(cafeDecorat);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.7;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Crema";
	}
}
