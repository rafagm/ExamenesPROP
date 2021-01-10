package pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Cafe c = new CafeSol();
		printDetails(c);
		
		c = new Llet(c);
		printDetails(c);
		
		c = new Xocolata(c);
		printDetails(c);
		
		c = new Crema(c);
		printDetails(c);
		
		c = new Xocolata(c);
		printDetails(c);

	}

	private static void printDetails(Cafe c) {
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	}

}
