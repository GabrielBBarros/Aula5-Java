package Controller;
import Model.Livro;
import View.Menu;

import java.util.ArrayList;
import Model.Livro;

public class ControladorLivro {
	 private ArrayList<Livro> livros = new ArrayList<>();

	 public boolean adicionarLivro(String nome, String descricao, int quantidade) {
		    try {
		        Livro livro = new Livro(nome, descricao, quantidade);
		        livros.add(livro);
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
		}
	    
	 public String listarLivros() {
		    StringBuilder sb = new StringBuilder();
		    for (Livro livro : livros) {
		        sb.append("Nome: " + livro.getNome() + "\n");
		        sb.append("Quantidade: " + livro.getQuantidade() + "\n");
		        sb.append("Descrição: " + livro.getDescricao() + "\n\n");
		    }
		    return sb.toString();
		}

	
}
