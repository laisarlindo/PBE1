package br.com.cursos.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_instrutor")
public class Instrutor {
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_instrutor;
		
		@Column(name = "nome")
		private String nome;
		
		@Column (name = "email")
		private String email;
		
		@Column (name = "telefone")
		private int telefone;
		
		@Column (name = "areaespecializacao")
		private String areaespecializacao;
		
		@Column (name = "expereencia")
		private String experiencia;
		
		//CONSTRUTORES
		public Instrutor() {
			
		}
		public Instrutor(Long id_instrutor, String nome,String email, int telefone, String areaespecializacao, String experiencia) {
			this.id_instrutor = id_instrutor;
			this.email = email;
			this.telefone = telefone;
			this.areaespecializacao = areaespecializacao;
			this.experiencia = experiencia;
		}
		
		//GETTERS E SETTERS
		public Long getId_instrutor() {
			return id_instrutor;
		}
		public void setId_instrutor(Long id_instrutor) {
			this.id_instrutor = id_instrutor;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public String getAreaespecializacao() {
			return areaespecializacao;
		}
		public void setAreaespecializacao(String areaespecializacao) {
			this.areaespecializacao = areaespecializacao;
		}
		public String getExperiencia() {
			return experiencia;
		}
		public void setExperiencia(String experiencia) {
			this.experiencia = experiencia;
		}
		
		

}
