package programacao_backend;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print(" Digite o raio do circulo");
	double  raio = sc.nextDouble();
	
	double area = 3.14159 *(raio*raio);
	
	System.out.printf("A area é %.4f:",area);
	
	
	sc.close();

}

}