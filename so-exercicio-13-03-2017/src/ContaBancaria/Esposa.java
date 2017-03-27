package ContaBancaria;

public class Esposa extends Thread {
	private Conta conta;

	public Esposa(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		while (true) {
			conta.depositar(500);
			Espera.umSegundo();
		}
	}
	
}