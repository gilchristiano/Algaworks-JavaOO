package com.gamesxi.cursos.joo.excecoes;

public class ContaCorrente {
	
	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		if(deposito < 0) {
			throw new IllegalArgumentException("O valor de depósito não pode ser negativo!");	
		} else {
			saldo += deposito;
		}
	}
	
	public void showSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void sacar(double dinheiro) throws SaldoInsuficienteException {
		System.out.println("Saque solicitado de: R$ " + dinheiro);
		double temporario = this.saldo - dinheiro;
		if(temporario < 0.0) {
			throw new SaldoInsuficienteException("Você não possui saldo suficiente!");
		}
		else {
			this.saldo -= dinheiro;
		}
	}
}
