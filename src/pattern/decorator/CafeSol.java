package pattern.decorator;

public class CafeSol implements Cafe {

	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "Cafe";
	}

}
