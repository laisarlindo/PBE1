package prjZoologico;

public class subclasseReptil extends ClasseAnimal {
	//MÈTODOS DA SUBCLASSE
	
	//TROCARPELE
	public void trocarPele() {
	System.out.println(this.getAtributoNome() + "Está trocando de pele");

	}
	public void rastejar() {
		System.out.println(this.getAtributoNome() + "Está a rastejar");
	}
	@Override
	public void metodoEmitirsom() {
		System.out.println("SHIHHH");
	}
}
