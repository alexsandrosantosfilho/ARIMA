package pojo;

import java.util.Date;

public class Cadastro {
	
	private String nome_contato;
	private String telefone;
	private String email;	
	private Date dataAtualiza��o;
	
	public String getNome_contato() {
		return nome_contato;
	}
	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataAtualiza��o() {
		return dataAtualiza��o;
	}
	
	public void setDataAtualiza��o(Date dataAtualiza��o) {
		this.dataAtualiza��o = dataAtualiza��o;
	}	
	

}
