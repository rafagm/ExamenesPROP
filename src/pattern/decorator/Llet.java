package pattern.decorator;

public class Llet extends DecoratorCafe {

	public Llet(Cafe cafeDecorat) {
		super(cafeDecorat);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Llet";
	}

}
