package funcionario;

public class funcionario {
	//ATRIBUTOS
	private String nomeFuncionario;
	private double salarioBruto;
	private double imposto;
	private double salarioLiquido;
	
	//CONSTRUTORES
	public funcionario () {
		
	}
	public funcionario (String nomeFuncionario,double salarioBruto,double imposto) {
		this.nomeFuncionario = nomeFuncionario;
		 this.salarioBruto = salarioBruto;
		 this.imposto = imposto;
	}
	//GETTERS E SETTERS
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	//MÉTODOS
	void calcularSalario(double calcularSalario) {
		salarioLiquido = salarioBruto - imposto;
	}
	void aumentarSalario(double aumenatarSalario) {
		if (Saldo > sacar) { 
			Saldo -= sacar;
	}
	}
	void exibirInformacao () {
		System.out.println("Nome : " + nomeTitular);
		System.out.println("Saldo : " + Saldo);
		System.out.println("Numero da conta : " + numeroConta);
	}
	}
}
