package prjZoologico;

public class ClasseAnimal {
	//ATRIBUTOS
	private String atributoNome;
	private String atributoRaca;
	private String atributoSexo;
	private double atributoPeso;
	
	//CONSTRITORES
	public ClasseAnimal() {
		
	}
	public ClasseAnimal(String parametroNome, String parametroRaca,String parametroSexo, double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
		this.atributoPeso = parametroPeso;
	}
	// MÉTODOS SETTERS
	 public void setNome (String parametroNome) {
		 this.atributoNome = parametroNome;
	 }
	 public void setPeso(double parametroPeso) {
		 if(parametroPeso > 0) {
		 this.atributoPeso = parametroPeso;	 
		 }
		 else {
			 this.atributoPeso = 10;
		 }
		 
	 }
    //MÉTODOS
	public void metodoComer() {
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + "está obeso, vamos exercitar");
		}
		else {
			this.atributoPeso += 10;
		}
		
	}
	public void metodoComer(int parametroRacao) {
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + "está obeso, vamos exercitar");
		}
		else {
			this.atributoPeso += parametroRacao;
		}
		
	}
	public void metedoExercitar() {
		if(this.atributoPeso <= 50) {
			System.out.println(this.atributoNome + "Que tal se alimentar?");	
		}
		else {
			this.atributoPeso -= 10;
		}
	}
	public void exibirInfo() {
		System.out.println("Nome: " + this.atributoNome);
		System.out.println("Peso: " + this.atributoPeso );
	}
	public void metodoEmitirsom() {
		System.out.println("Barulho do bichinho");
	}
	//CONTINUAÇÃO DOS SETTERS E GETEERS
	public String getAtributoNome() {
		return atributoNome;
	}
	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}
	public String getAtributoRaca() {
		return atributoRaca;
	}
	public void setAtributoRaca(String atributoRaca) {
		this.atributoRaca = atributoRaca;
	}
	public String getAtributoSexo() {
		return atributoSexo;
	}
	public void setAtributoSexo(String atributoSexo) {
		this.atributoSexo = atributoSexo;
	}
	public double getAtributoPeso() {
		return atributoPeso;
	}
	public void setAtributoPeso(double atributoPeso) {
		this.atributoPeso = atributoPeso;
	}
}
