package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_diciplina")
public class Diciplina {
	
	//ATRIBUDOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_diciplina;
	
	@Column(name = "nome")
	private String nome;
	
	@Column (name = "descricao")
	private String descricao;
	
	@Column (name = "cargaHoraria")
	private int cargaHoraria;
	
	//CONSTRUTORES
	public Diciplina() {
		
	}
	public Diciplina(Long id_diciplina, String nome, String descricao, int cargaHoraria) {
		this.id_diciplina = id_diciplina;
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;	
	}
	
	//GETTERS E SETTERS
	public Long getId_diciplina() {
		return id_diciplina;
	}
	public void setId_diciplina(Long id_diciplina) {
		this.id_diciplina = id_diciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
