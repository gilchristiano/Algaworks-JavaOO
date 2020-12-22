package com.gamesxi.cursos.joo.enums;

public enum OperacaoAritmetica {
	ADICAO {
		public int Operacao(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		public int Operacao(int x, int y) {
			return x - y;
		}
	},
	MULTIPLICACAO {
		public int Operacao(int x, int y) {
			return x * y;
		}
	},
	DIVISÃO {
		public int Operacao(int x, int y) {
			return x / y;
		}
	};
	
	public abstract int Operacao(int x, int y);
	
}
