package pattern.decorator;

public class CafeSol extends Cafe {

	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "Cafe";
	}

}
