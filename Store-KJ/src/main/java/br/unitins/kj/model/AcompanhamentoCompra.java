package br.unitins.kj.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AcompanhamentoCompra extends DefaultEntity{
	
	@OneToOne
	@JoinColumn(name = "acompanhamento_compra", unique = true)
	private Compra compra;
	
	

}
