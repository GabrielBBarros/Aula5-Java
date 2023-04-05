package Controller;
import Model.Filme;
import View.Menu;

import java.util.ArrayList;


public class Controlador {
	 private ArrayList<Filme> filmes = new ArrayList<>();

	 public boolean adicionarFilme(String nome, int quantidade, String genero) {
		    try {
		        Filme filme = new Filme(nome, quantidade, genero);
		        filmes.add(filme);
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
		}
	    
	 public String listarFilmes() {
		    StringBuilder sb = new StringBuilder();
		    for (Filme filme : filmes) {
		        sb.append("Nome: " + filme.getNome() + "\n");
		        sb.append("Quantidade: " + filme.getQuantidade() + "\n");
		        sb.append("Genero: " + filme.getGenero() + "\n\n");
		    }
		    return sb.toString();
		}

	
}