package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_curso;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column (name = "descricao")
	private String descricao;
	
	@Column (name = "cargaHoraria")
	private int cargaHoraria;
	
	@Column (name = "nivelDifilcudade")
	private int nivelDifilcudade;
	
	//CONSTRUTORES
	public Curso() {
		
	}
	public Curso(Long id_curso, String titulo, String descricao, int cargaHoraria,int nivelDifilcudade) {
		this.id_curso = id_curso;
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.nivelDifilcudade = nivelDifilcudade;
		
	}
	
	//GETTERS E SETTERS
	public Long getId_curso() {
		return id_curso;
	}
	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public int getNivelDifilcudade() {
		return nivelDifilcudade;
	}
	public void setNivelDifilcudade(int nivelDifilcudade) {
		this.nivelDifilcudade = nivelDifilcudade;
	}
}
