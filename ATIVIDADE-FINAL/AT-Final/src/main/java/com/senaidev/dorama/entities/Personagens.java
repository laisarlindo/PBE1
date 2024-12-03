package com.senaidev.dorama.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_personagens")
public class Personagens {
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_personagem;
		
		@Column(name = "nome",nullable = false)
		private String nome;
		
		@Column(name = "papel",nullable = false, unique = true)
		private String papel;
		
		@Column(name = "pontoForte",nullable = false)
		private String pontoForte;
		
		//CONTRUTORES
		public Personagens() {
			
		}
		public Personagens(Long id_personagem, String papel, String nome, String pontoForte) {
			this.id_personagem = id_personagem;
			this.nome = nome;
			this.papel = papel;
			this.pontoForte = pontoForte;
			
		}
		
		//GETTERS E SETTERS
		public Long getId_personagem() {
			return id_personagem;
		}
		public void setId_personagem(Long id_personagem) {
			this.id_personagem = id_personagem;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getPapel() {
			return papel;
		}
		public void setPapel(String papel) {
			this.papel = papel;
		}
		public String getPontoForte() {
			return pontoForte;
		}
		public void setPontoForte(String pontoForte) {
			this.pontoForte = pontoForte;
		}
}