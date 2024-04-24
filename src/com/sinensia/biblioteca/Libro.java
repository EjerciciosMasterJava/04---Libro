package com.sinensia.biblioteca;

/**
 * Clase Libro
 */
public class Libro {
	protected static int contador;
	private int isbn;
	private String titulo;
	private String autor;
	private int numPaginas;

	/**
	 * Constructor por defecto de Libro
	 */
	public Libro() {
		super();
		contador++;
	}
	
	/**
	 * @Constructor libro
	 * @param isbn el isbn del libro
	 * @param titulo el titulo del libro
	 */
	public Libro(int isbn, String titulo) {
		this();
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	/**
	 * Constructor de Libro con todos los parametros
	 * @param isbn el isbn del libro
	 * @param titulo el titulo del libro
	 * @param autor el autor del libro
	 * @param numPaginas el numero de paginas del libro
	 */
	public Libro(int isbn, String titulo, String autor, int numPaginas) {
		this();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
}
