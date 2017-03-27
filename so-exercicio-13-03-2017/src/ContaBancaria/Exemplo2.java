package ContaBancaria;

public class Exemplo2 {
	public static void main(String[] args) {
		Conta conjunta = new Conta(2500, "Marcos e Maria");
		Marido m = new Marido(conjunta);
		Esposa e = new Esposa(conjunta);
		Filha f = new Filha(conjunta);
		m.start();
		e.start();
		f.start();
	}
	
}