package br.unitins.kj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Chat extends DefaultEntity{

	@ManyToOne
	@Column(name="id_usuario")
	private Usuario usuario;
	
	private List<Mensagem> mensagens;

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}
	
	public Mensagem addMensagem(String mensagemI, Usuario usuarioI) {
		
		Mensagem mensagem = new Mensagem(mensagemI, usuarioI);
		return mensagem;
	}
}
