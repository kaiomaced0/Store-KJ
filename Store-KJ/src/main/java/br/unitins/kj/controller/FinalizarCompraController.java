package br.unitins.kj.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.unitins.kj.application.Session;
import br.unitins.kj.application.Util;
import br.unitins.kj.model.Compra;
import br.unitins.kj.model.Pagamento;
import br.unitins.kj.model.Usuario;
import br.unitins.kj.repository.CompraRepository;

@ViewScoped
@Named
public class FinalizarCompraController implements Serializable{

	private static final long serialVersionUID = -5026285540821281897L;
	
	private Compra carrinho;
	
	private Pagamento pagamento;
	
	@Inject
	private CompraRepository compraRepository;
	
	public List<ItemCompra> getItensCarrinho() {
		Session session = Session.getInstance();
		
		carrinho = (Compra) session.get("carrinho");
		
		if (carrinho == null)
			return new ArrayList<ItemCompra>();
		
		return carrinho.getListaItemCompra();
	}
	
	public TipoPagamento[] getListaTipoPagamento() {
		return TipoPagamento.values();
	}
	
	public BandeiraCartao[] getListaBandeiraCartao() {
		return BandeiraCartao.values();
	}
	
	public void finalizarCompra() {
		Usuario usuario = (Usuario) Session.getInstance().get("usuarioLogado");
		
		// validando o usuario
		if (usuario == null) {
			Util.addErrorMessage("Faça o login antes de finalizar a compra");
			return;
		}
		
		// validando a bandeira do cartao
		if (getPagamento().getTipoPagamento().equals(TipoPagamento.CREDITO) || 
				getPagamento().getTipoPagamento().equals(TipoPagamento.DEBITO) ) {
			if (getPagamento().getBandeiraCartao() == null) {
				Util.addErrorMessage("Seleciona uma bandeira do cartão.");
				return;
			}
		}
		
		carrinho.setUsuario(usuario);
		carrinho.setPagamento(getPagamento());
		
		try {
			compraRepository.salvar(carrinho);
			Util.addInfoMessage("Compra realizada com sucesso.");
		} catch (Exception e) {
			Util.addErrorMessage(e.getMessage());
		}
		
	}

	public Pagamento getPagamento() {
		if (pagamento == null)
			pagamento = new Pagamento();
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	

}
