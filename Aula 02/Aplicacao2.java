package prjCaneta;

import java.util.Scanner;

public class Aplicacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Livro livro01 = new Livro("Alice no Pais","Julio Trigueiro");
		Livro livro02 = new Livro("Quarto de despejo","Pedro Francisco");
		
		System.out.println("Livros disponiveis");
		System.out.println("01. ");
		livro01.status();
		System.out.println("02. ");
		livro02.status();
		
		System.out.println("Qual livro deseja alugar?");
		int escolha = sc.nextInt();
		

	}

}
