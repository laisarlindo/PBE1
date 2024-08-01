package programacao_backend;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Digite seu código de trabalho ");
		int  codigo = sc.nextInt();
		
		
		System.out.print(" Digite as horas de trabalho");
		int horas = sc.nextInt();
		
		System.out.print(" Digite quanto você recebe por hora de trabalho");
		double recebe = sc.nextDouble();
		
		 double salario = horas * recebe; 
		System.out.printf("O salario do funcionario %d é %.2f",codigo, salario);
			
		
		
		
		
		sc.close();

	}
}
