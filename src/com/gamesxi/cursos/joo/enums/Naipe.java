package com.gamesxi.cursos.joo.enums;
public enum Naipe {
		OURO("Vermelho"),
		ESPADA("Preto"),
		PAUS("Vermelho"),
		COPA("Preto");

	private String cor;
	
	Naipe(String cor) {
		// construtor automático ao criar o "objeto" enumarado
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
}
