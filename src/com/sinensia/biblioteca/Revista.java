package com.sinensia.biblioteca;

public class Revista {
    private static int NUMERO_PAGINAS=-77;
    private String titulo;
    private String contenido;
    private int pag;

    public Revista() {                
            this.titulo = "Lo que sea";
    }

    public Revista(String contenido) {
            this();
            this.contenido = contenido;
    }
    
    public Revista(String contenido, int pag) {
            this(contenido);
            this.pag = pag;
    }

	@Override
	public String toString() {
		return "Revista [titulo=" + titulo + ", contenido=" + contenido + ", pag=" + pag + "]";
	}


            
}