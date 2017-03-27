package ContaBancaria;

import static java.lang.System.out;

public class Conta {
	private long saldo;
	private String dono;
	
	public Conta(long saldoInicial, String dono) {
		saldo = saldoInicial;
		this.dono = dono;
		imprimir("saldo inicial de R$ " + saldo);
	}
	
	public void depositar(long deposito) {
		this.saldo += deposito;
		imprimir("dep�sito de R$ " + deposito + "; saldo atualizado: R$ " + saldo);
	}
	
	public synchronized boolean sacar(long saque) {
		if (saque <= saldo) {
			Espera.umSegundo(); // simula uma demora na opera��o de d�bito
			this.saldo -= saque;
			imprimir("saque bem-sucedido de R$ " + saque + "; saldo atualizado: R$ " + saldo);
			return true;
		}
		else {
			imprimir("saque n�o permitido de R$ " + saque + "; saldo atualizado: R$ " + saldo);
			return false;
		}
	}

	private void imprimir(String msg) {
		out.println("Conta de " + dono + ": " + msg);
	}

}