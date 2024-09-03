package prjZoologico;

public class SubclasseCarnivoros extends ClasseAnimal {
	//MÉTODOS DA SUBCLASSE 
	public void metodoCacar() {
		System.out.println(this.atributoNome + "Está caçando");
	}
	@Override
	public void metodoEmitirsom() {
		System.out.println("RUUAARR");
	}
}
