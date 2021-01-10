package pattern.state;

public class State5 extends State {

	
	public State5() {
		setSaldo(5);
	}

	@Override
	public State addCoin(Moneda5 moneda) {
		return new State10();
	}

	@Override
	public State addCoin(Moneda10 moneda) {
		return new State15();
	}

}
