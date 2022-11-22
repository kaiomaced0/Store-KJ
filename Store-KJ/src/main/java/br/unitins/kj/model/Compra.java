package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import br.unitins.kj.model.especial.Cupom;

@Entity
public class Compra extends DefaultEntity {
	
	@NotBlank
	private Carrinho carrinho;
	private List<Cupom> cupons;
	
	
	

}
