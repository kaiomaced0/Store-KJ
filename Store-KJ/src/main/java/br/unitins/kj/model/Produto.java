package br.unitins.kj.model;

import javax.persistence.Entity;

@Entity
public class Produto extends DefaultEntity {

	private Double valor;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
