package prjNovo;

public class Conta {
// ATRIBUTOS
	private int numeroConta;
	private String nomeTitular;
	private double Saldo;
	
	//CONSTRUTORES
	public Conta() {
	}
	public Conta(int numeroConta,String nomeTitular, double Saldo){
		
		 this.numeroConta= numeroConta;
		 this.nomeTitular = nomeTitular;
		 this.Saldo = Saldo;
	}
		 public Conta(int numeroConta,String nomeTitular) {
			 this.numeroConta= numeroConta;
			 this.nomeTitular = nomeTitular;
			 this.Saldo = 0;
			}
		 //GETTERS E SETTERS
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public String getNomeTitular() {
			return nomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}
		public double getSaldo() {
			return Saldo;
		}
		public void setSaldo(double saldo) {
			Saldo = saldo;
		}
			
	}
	

