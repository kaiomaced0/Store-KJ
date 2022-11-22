package br.unitins.kj.model.especial;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import br.unitins.kj.model.DefaultEntity;
import br.unitins.kj.model.Produto;

@Entity
public class Cupom extends DefaultEntity{
	
	@NotBlank
	private String nome; //nome cupom
	
	private Integer quantidade; // quantidade de cupons
	private Double porcentagem; 
	private Double limitePorcentagem; // limite para o desconto de porcentagem
	private Double valor; // desconto para a forma a baixo
	private Double valorQuant; // de x em x preço, da o desconto de valor
	private Produto produto; // quando o cupom for para um produto especifico
	private Integer limiteProduto; // limite de produtos com esse desconto
	private Integer limitePorPessoa; // limitar o uso do cupom para x por pessoa
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public Double getLimitePorcentagem() {
		return limitePorcentagem;
	}
	public void setLimitePorcentagem(Double limitePorcentagem) {
		this.limitePorcentagem = limitePorcentagem;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getValorQuant() {
		return valorQuant;
	}
	public void setValorQuant(Double valorQuant) {
		this.valorQuant = valorQuant;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getLimiteProduto() {
		return limiteProduto;
	}
	public void setLimiteProduto(Integer limiteProduto) {
		this.limiteProduto = limiteProduto;
	}
	public Integer getLimitePorPessoa() {
		return limitePorPessoa;
	}
	public void setLimitePorPessoa(Integer limitePorPessoa) {
		this.limitePorPessoa = limitePorPessoa;
	}
	
	
	
}
