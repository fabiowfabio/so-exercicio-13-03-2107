package ContaBancaria;

public class Espera {
	public static void umSegundo() {
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {}
	}

	public static void meioSegundo() {
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {}
	}

}
