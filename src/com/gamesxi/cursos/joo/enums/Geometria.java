package com.gamesxi.cursos.joo.enums;

public enum Geometria {
	QUADRADO {
		public int perimetro(int a, int b, int c, int d) {
			return ((a == b) && (b == c) && (c == d))? (a + b + c + d) : 0;
		}
		
		public int perimetro(int a, int b, int c) {
			return 0;
		}
	},
	RETANGULO {
		public int perimetro(int a, int b, int c) {
			return 0;
		}

		public int perimetro(int a, int b, int c, int d) {
			return ((a != b) && (c != d) && (a == c) && (b == d))? (a + b + c + d) : 0;
			
		}
	},
	TRIANGULO {
		public int perimetro(int a, int b, int c) { return a + b + c; }

		public int perimetro(int a, int b, int c, int d) { return 0; }
	};
	
	public abstract int perimetro(int a, int b, int c);
	public abstract int perimetro(int a, int b, int c, int d);

}
