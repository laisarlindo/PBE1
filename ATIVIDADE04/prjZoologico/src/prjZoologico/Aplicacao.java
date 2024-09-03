package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.setNome("Dumbo");
		elefante.setPeso(-100);
		
		ClasseAnimal girafa = new ClasseAnimal("GitHub","Russa","Femea",50);
		
		SubclasseCarnivoros leao = new SubclasseCarnivoros();
		leao.atributoNome = "Simba";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Macho";
		leao.atributoPeso = 123;
		
		leao.exibirInfo();
		leao.metodoCacar();
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		elefante.metodoEmitirsom();
		girafa.metodoEmitirsom();
		leao.metodoEmitirsom();
		

		

	}

}
