package prjCaneta;

public class Livro {
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	
	public Livro (String Livro, String Autor) {
		this.nomeLivro = Livro;
		this.nomeAutor = Autor;
		this.alugado = false;
		
		
	}
	
	void status() {
		System.out.println(this.nomeLivro + ":" + (this.alugado? "alugado":"Disponivel"));
	}
	void alugar() {
		this.alugado = true;	
	}
	void devolver() {
		this.alugado = false;
		
	}
	

}
