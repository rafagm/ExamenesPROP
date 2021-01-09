
public class StateInitial extends State {

	
	public StateInitial() {
		setSaldo(0);
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
