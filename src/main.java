import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		MaquinaVending m = new MaquinaVending();
		
		while (true) {
			if (m.getLlauna()) {
				System.out.println("UNA LLAUNA");
			}
			
			System.out.println("Saldo: " + m.getSaldo());
			System.out.println("Introdueix moneda: ");
			
			int num = in.nextInt();
			
			if(num == 5) {
				m.add5Saldo();
			} else if (num == 10) {
				m.add10Saldo();
			}
		}

	}

}
