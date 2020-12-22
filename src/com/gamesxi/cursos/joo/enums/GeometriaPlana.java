package com.gamesxi.cursos.joo.enums;

public class GeometriaPlana {

	public static void main(String[] args) {
		int a = 8, b = 5, c = 8, d = 5;
		
		for(Geometria objeto : Geometria.values()) {
			int ret = objeto.perimetro(a, b, c, d);
			int tri = objeto.perimetro(a, b, c);
			if(ret != 0) {
				System.out.println(objeto + " -> " + objeto.perimetro(a, b, c, d));
			}
			if(tri != 0) {
				System.out.println(objeto + " -> " + objeto.perimetro(a, b, c));
			}
		}
	}

}
