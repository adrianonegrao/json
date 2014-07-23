package br.com.laboratorio.json.classes;

import java.io.Serializable;
import java.util.List;

public class Cliente implements Serializable {
	
	private String nome;
	private int idade;
	private List<String> dependentes;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<String> getEstiloMusical() {
		return dependentes;
	}
	public void setEstiloMusical(List<String> estiloMusical) {
		this.dependentes = estiloMusical;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
