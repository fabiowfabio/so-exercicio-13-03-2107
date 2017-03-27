package ContaBancaria;

public class Marido extends Thread {
	private Conta conta;

	public Marido(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		while (true) {
			conta.sacar(800);
			Espera.meioSegundo();
		}
	}
	
}
