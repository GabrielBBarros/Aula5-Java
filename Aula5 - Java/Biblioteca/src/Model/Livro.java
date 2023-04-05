package Model;

public class Livro {
	private String nome;
	private String descricao;
	private int quantidade;
	
	
	public Livro(){
		
	}
	
	public Livro(String nome, String descricao, int quantidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
