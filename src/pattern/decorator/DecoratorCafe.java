package pattern.decorator;

public abstract class DecoratorCafe extends Cafe {
	private Cafe cafeDecorat;

	public DecoratorCafe(Cafe cafeDecorat) {
		this.cafeDecorat = cafeDecorat;
	}
	
	@Override
	public double getCost() {
		return cafeDecorat.getCost();
	}
	
	@Override
	public String getIngredients() {
		return cafeDecorat.getIngredients();
	}
}
