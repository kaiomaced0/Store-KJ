package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import br.unitins.kj.model.especial.Cupom;

@Entity
public class Compra extends DefaultEntity {
	
	@NotBlank
	private Carrinho carrinho;
	
	@NotBlank
	private Pagamento pagamento;
	
	@OneToOne
	private AcompanhamentoCompra acompanhamentoCompra;
	

}
