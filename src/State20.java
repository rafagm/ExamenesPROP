
public class State20 extends State {

	public State20() {
		setSaldo(5);
	}
	
	@Override
	public boolean getLlauna() {
		return true;
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
