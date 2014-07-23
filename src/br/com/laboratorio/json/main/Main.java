package br.com.laboratorio.json.main;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.laboratorio.json.classes.Cliente;
import br.com.laboratorio.json.classes.Endereco;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Adriano Neves");
		c1.setIdade(28);
		List<String> lista = new ArrayList<String>();
		lista.add("Maria da Silva");
		lista.add("José da Silva");
		c1.setEstiloMusical( lista );
		
		Endereco endereco = new Endereco();
		endereco.setEndereco("Av. Faria Lima 2487, Itaim Bibi");
		c1.setEndereco( endereco );
		
		Gson gson = new Gson();
		String c1json = gson.toJson(c1);
		System.out.println( c1json );
		
		Cliente cliente = gson.fromJson(c1json, Cliente.class);
		System.out.println( cliente.getNome() );
		System.out.println( cliente.getIdade() );
		System.out.println( cliente.getEstiloMusical().get( 0 ));
		System.out.println( cliente.getEstiloMusical().get( 1 ));
		System.out.println( cliente.getEndereco().getEndereco() );
	}
}
