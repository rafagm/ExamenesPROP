
public abstract class State {
	private int saldo;
	
	public abstract boolean getLlauna();
	public abstract State addCoin(Moneda5 moneda);
	public abstract State addCoin(Moneda10 moneda);
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
