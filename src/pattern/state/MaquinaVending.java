package pattern.state;

public class MaquinaVending {
	private State state;
	
	public MaquinaVending() {
		state = new StateInitial();
	}

	public boolean getLlauna() {
		return state.getLlauna();
	}

	public int getSaldo() {
		return state.getSaldo();
	}

	public void add5Saldo() {		
		state = state.addCoin(new Moneda5());
	}

	public void add10Saldo() {
		state = state.addCoin(new Moneda10());
	}

}
