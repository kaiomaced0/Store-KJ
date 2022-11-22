package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Carrinho extends DefaultEntity{
	
	private List<ProdutoQuantidade> produtos;
	private Double valorSelecionado;
	private Double valorTotal ;
	

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
