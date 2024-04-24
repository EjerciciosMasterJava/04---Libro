package com.sinensia.biblioteca;


public class Directora {
	public static void main(String[] args) {
		Libro libro1 = new Libro();
		Libro libro2 = new Libro(223452,"libro2");
		Libro libro3 = new Libro(2234,"libro3","autor",200);
		
		System.out.println(Libro.contador);

		
	}
}
