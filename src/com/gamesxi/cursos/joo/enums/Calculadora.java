package com.gamesxi.cursos.joo.enums;

public class Calculadora {

	public static void main(String[] args) {
	
		OperacaoAritmetica calculo = OperacaoAritmetica.ADICAO;
		
		System.out.println(calculo + " -> " + calculo.Operacao(7, 8));
		
		for(OperacaoAritmetica todosOperadores : OperacaoAritmetica.values()) {
			System.out.println(todosOperadores + " -> " + todosOperadores.Operacao(20, 5));
		}
	}

}
