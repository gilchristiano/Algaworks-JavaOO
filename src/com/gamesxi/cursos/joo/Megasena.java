package com.gamesxi.cursos.joo;

public class Megasena {
	
	private int numeros;
	
	public void setQuantidade(int numeros) {
		this.numeros = numeros; // quantidade de números no volante
	}

	public int sorteio() {
		return (int) (Math.ceil(Math.random()*this.numeros));
	}

	public void resultados(int numeros) {
		int intLoop = 1;
		while(intLoop <= 6) {
			System.out.println("Número: " + intLoop + " = " + this.sorteio());
			intLoop++;
		}	
	}
	
}
