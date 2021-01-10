package pattern.state;

public abstract class State {
	private int saldo;
	
	public abstract State addCoin(Moneda5 moneda);
	public abstract State addCoin(Moneda10 moneda);
	
	public boolean getLlauna() {
		return false;
	}
	
	protected int getSaldo() {
		return saldo;
	}
	protected void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
