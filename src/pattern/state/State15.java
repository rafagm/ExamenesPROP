package pattern.state;

public class State15 extends State {

	public State15() {
		setSaldo(0);
	}
	
	@Override
	public boolean getLlauna() {
		return true;
	}

	@Override
	public State addCoin(Moneda5 moneda) {
		return new State5();
	}

	@Override
	public State addCoin(Moneda10 moneda) {
		return new State10();
	}

}
