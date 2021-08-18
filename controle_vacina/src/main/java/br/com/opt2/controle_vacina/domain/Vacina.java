package br.com.opt2.controle_vacina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.opt2.controle_vacina.enuns.Aplicação;

@Entity
public class Vacina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cidade;
	private String executar;
	private String laboratório;
	private String responsavel;
	private String dose;
	private String dados;
	private Aplicação aplicação;
	
	
	public Vacina() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getExecutar() {
		return executar;
	}


	public void setExecutar(String executar) {
		this.executar = executar;
	}


	public String getLaboratório() {
		return laboratório;
	}


	public void setLaboratório(String laboratório) {
		this.laboratório = laboratório;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getDose() {
		return dose;
	}


	public void setDose(String dose) {
		this.dose = dose;
	}


	public String getDados() {
		return dados;
	}


	public void setDados(String dados) {
		this.dados = dados;
	}


	public Aplicação getAplicação() {
		return aplicação;
	}


	public void setAplicação(Aplicação aplicação) {
		this.aplicação = aplicação;
	}
	
	}