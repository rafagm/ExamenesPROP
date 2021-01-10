package pattern.decorator;

public class Xocolata extends DecoratorCafe {

	public Xocolata(Cafe cafeDecorat) {
		super(cafeDecorat);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.2;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Xocolata";
	}

}
