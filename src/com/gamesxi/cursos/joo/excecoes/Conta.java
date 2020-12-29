package com.gamesxi.cursos.joo.excecoes;

public class Conta {

	public static void main(String[] args) {
		
		double valor = 100.0;
		ContaCorrente deposito = new ContaCorrente(valor);	
		try {
			deposito.depositar(30.0);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Voc� executour a opera��o ilegal: " + e.getMessage());
		}
		finally {
			deposito.showSaldo();
		}
	}
}