package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.unitins.kj.model.especial.Cupom;


@Entity
public class Carrinho extends DefaultEntity{
	
	private List<ProdutoQuantidade> produtos;
	private Double valorSelecionado;
	private Double valorTotal ;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@OneToMany
	@Column(name="cupons")
	private List<Cupom> cupons;
	
	@OneToOne
	@JoinColumn(name = "id_endereco", unique = true)
	private Endereco endereco;
	
	@Column(name = "valor_frete")
	private double valorFrete;
	

	public Double getValorSelecionado() {
		return valorSelecionado;
	}

	public void setValorSelecionado(Double valorSelecionado) {
		this.valorSelecionado = valorSelecionado;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ProdutoQuantidade> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoQuantidade> produtos) {
		this.produtos = produtos;
	}
	
	
	

}
