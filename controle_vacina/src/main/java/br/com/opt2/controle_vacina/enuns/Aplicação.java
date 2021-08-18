package br.com.opt2.controle_vacina.enuns;

public enum Aplicação {
	RESPONSAVEL("responsavel"),
	PRODUÇÃO("Farmaceutico em geral"),
	IDEM_RESPONSAVEL("idem_responsavel");
	private String especialidade;
	private Aplicação(String especialidade) {
	this.especialidade = especialidade;
	}
	public String getEspecialidade() {
	return especialidade;
	}
	}
