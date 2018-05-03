package pojo;

public class Local {
	private double custo;
	private String cadastro;
	private String localizacao;
	private String estrutura;
	private String maximoPessoas;
	private Integer id;
	
	
	
	
	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
	    return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public double getCusto() {
		return  custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getCadastro() {
		return cadastro;
	}
	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}
	public String getMaximoPessoas() {
		return maximoPessoas;
	}
	public void setMaximoPessoas(String maximoPessoas) {
		this.maximoPessoas = maximoPessoas;
	}
	
	
	
	
}
