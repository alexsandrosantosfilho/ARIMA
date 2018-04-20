package pojo;

import java.util.Date;

public class Cadastro {
	
	private String nome_contato;
	private String telefone;
	private String email;	
	private Date dataAtualização;
	
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
	
	public Date getDataAtualização() {
		return dataAtualização;
	}
	
	public void setDataAtualização(Date dataAtualização) {
		this.dataAtualização = dataAtualização;
	}	
	

}
