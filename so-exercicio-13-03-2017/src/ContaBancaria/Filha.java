package ContaBancaria;

public class Filha extends Thread {
	private Conta conta;

	public Filha(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		while (true) {
			conta.sacar(600);
			Espera.meioSegundo();
		}
	}
	
}