package Model;

public class Filme {
	public String nome;
	public int quantidade;
	public String genero;
	
	public Filme() {
	}
	
	public Filme(String nome, int quantidade, String genero) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
