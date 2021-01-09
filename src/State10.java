
public class State10 extends State {

	public State10() {
		setSaldo(10);
	}

	@Override
	public State addCoin(Moneda5 moneda) {
		return new State15();
	}

	@Override
	public State addCoin(Moneda10 moneda) {
		return new State20();
	}

}
