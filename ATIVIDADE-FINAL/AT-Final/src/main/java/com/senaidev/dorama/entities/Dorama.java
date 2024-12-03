package com.senaidev.dorama.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_dorama")
public class Dorama {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dorama;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "categoria", nullable = false, length = 100)
	private String categoria;
	
	@Column(name = "episodios", nullable = false , length = 100)
	private int episodios;
	
	@Column(name = "emissora", nullable = false)
	private String emissora;
	
	//CONTRUTORES
	public Dorama() {
		
	}
	
	public Dorama(Long id_dorama, String nome, String categoria, int episodios, String emissora ) {
		this.id_dorama = id_dorama;
		this.nome = nome;
		this.categoria = categoria;
		this.episodios = episodios;
		this.emissora = emissora;
	}
	
	//GETTERS E SETTERS

	public Long getId_dorama() {
		return id_dorama;
	}

	public void setId_dorama(Long id_dorama) {
		this.id_dorama = id_dorama;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public String getEmissora() {
		return emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}
}