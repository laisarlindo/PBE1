package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_turma")
public class Turma {
	
	//ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_turma;
	
	@Column (name = "dataInicio")
	private String dataInicio;
	
	@Column (name = "dataTermino")
	private String dataTermino;
	
	@Column (name = "horarioAulas")
	private int horarioAulas;
	
	@Column (name = "vagasDisponiveis")
	private int vagasDisponiveis;
	
	//CONSTRUTORES
	public Turma () {
		
	}
	public Turma(Long id_turma, String dataInicio, String dataTermino, int horarioAulas,int vagasDisponiveis) {
		this.id_turma = id_turma;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.horarioAulas = horarioAulas;
		this.vagasDisponiveis = vagasDisponiveis;
	}
	
	//GETTERS E SETTERS
	public Long getId_turma() {
		return id_turma;
	}
	public void setId_turma(Long id_turma) {
		this.id_turma = id_turma;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public int getHorarioAulas() {
		return horarioAulas;
	}
	public void setHorarioAulas(int horarioAulas) {
		this.horarioAulas = horarioAulas;
	}
	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}
	public void setVagasDisponiveis(int vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
	}
	
	

}
