package com.gamesxi.cursos.joo.excecoes;

public class TesteExcecoesChecadas{
	
public static void main (String[] args) {
	
		ContaCorrente cc = new ContaCorrente(250.0);
		cc.showSaldo();
		
		try {
			cc.sacar(500.0);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Atenção! Saldo insuficiente.");
		} finally {
			cc.showSaldo();
		}
	}
}
