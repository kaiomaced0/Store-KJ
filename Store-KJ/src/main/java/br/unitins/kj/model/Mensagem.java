package br.unitins.kj.model;

public class Mensagem {
	
	
	public Mensagem(String mensagem, Usuario usuario) {
		super();
		this.mensagem = mensagem;
		this.usuario = usuario;
	}
	private String mensagem;
	private Usuario usuario;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
