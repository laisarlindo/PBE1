package testePrj;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o código da peça 1?");
		int cod1 = sc.nextInt();
		
		System.out.println("Qual o código da peça 2?");
		int cod2 = sc.nextInt();
		
		System.out.println("Qual é o preço de cada unidade da peça 1?");
		double peca1 = sc.nextDouble();
		
		System.out.println("Qual é o preço de cada unidade da peça 2?");
		double peca2 = sc.nextDouble();
		
		System.out.println("Quantas unidades você deseja da peça 1?");
		int num1 = sc.nextInt();
		
		System.out.println("Quantas unidades da peça 2 você deseja?");
		int num2 = sc.nextInt();
		
		double soma = (num1 * peca1) + ( num2 * peca2);
				
		System.out.printf("O total a ser pego é: R$%.2f.", soma);
		sc.close();
	}

}
