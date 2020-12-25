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

		if(conta instanceof ContaCorrente) { // verifica se o objeto é conta corrente
			ContaCorrente ccor = (ContaCorrente) conta;
			System.out.println("Conta corrente: R$ " + ccor.getSaldo() + " e, o limite será " + ccor.getLimite());
		} else if (conta instanceof ContaPoupanca) { // verifica se é origem poupança
			ContaPoupanca cpop = (ContaPoupanca) conta;
			System.out.println("O saldo da poupança é R$ " + cpop.getSaldo() + " e, o rendimento será " + cpop.getRendimentos());
		} else {
			System.out.println("O saldo padrão será: R$ " + conta.getSaldo());
		}
	}

}
