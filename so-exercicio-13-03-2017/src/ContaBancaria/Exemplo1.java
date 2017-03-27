package ContaBancaria;

public class Exemplo1 {
	public static void main(String[] args) {
		Conta conjunta = new Conta(2500, "Marcos e Maria");
		Marido m = new Marido(conjunta);
		m.start();
	}
	
}
