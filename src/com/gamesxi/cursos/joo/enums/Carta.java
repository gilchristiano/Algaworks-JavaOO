package com.gamesxi.cursos.joo.enums;

public class Carta {
	
	private int numero;
	private Naipe cartaNaipe;
	
	public Carta(int numero, Naipe naipe) {

		this.numero = numero;
		this.cartaNaipe = naipe;
	}
	
	public void imprimeCarta() {
		System.out.println("Sou o " + this.numero + " de " + this.cartaNaipe + " e a cor é " + this.cartaNaipe.getCor());
	}
}
