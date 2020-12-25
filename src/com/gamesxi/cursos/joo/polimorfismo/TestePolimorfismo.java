package com.gamesxi.cursos.joo.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimeSaldo(conta);
	// ---------------------------------------------------
		Conta contacorrente = new ContaCorrente();
		contacorrente.setSaldo(3000);
		imprimeSaldo(contacorrente);
	// ---------------------------------------------------
		Conta contapoupanca = new ContaPoupanca();
		contapoupanca.setSaldo(8000);
		imprimeSaldo(contapoupanca);
	}
	
	public static void imprimeSaldo(Conta conta) {

		if(conta instanceof ContaCorrente) { // verifica se o objeto � conta corrente
			ContaCorrente ccor = (ContaCorrente) conta;
			System.out.println("Conta corrente: R$ " + ccor.getSaldo() + " e, o limite ser� " + ccor.getLimite());
		} else if (conta instanceof ContaPoupanca) { // verifica se � origem poupan�a
			ContaPoupanca cpop = (ContaPoupanca) conta;
			System.out.println("O saldo da poupan�a � R$ " + cpop.getSaldo() + " e, o rendimento ser� " + cpop.getRendimentos());
		} else {
			System.out.println("O saldo padr�o ser�: R$ " + conta.getSaldo());
		}
	}

}
