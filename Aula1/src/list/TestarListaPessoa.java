package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarListaPessoa {

	public static void main(String[] args) {
		// TODO 
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("A", "1"));
		pessoas.add(new Pessoa("B", "2"));
		pessoas.add(new Pessoa("C", "3"));
		pessoas.add(new Pessoa("D", "4"));
		
		boolean contains = pessoas.contains(new Pessoa("A", "1"));
		int indexOf = pessoas.indexOf(new Pessoa("A", "1"));
		
		pessoas.remove(0);
		pessoas.remove(new Pessoa("D", "4"));
		//Collections.sort(pessoas);//ordenar compareTo
		Collections.sort(pessoas, new PessoaPorCpfComparator());//ordenar
		
		System.out.println("pessoas.size: "+ indexOf);
		System.out.println("pessoas.size: "+pessoas.size());
		System.out.println("pessoas.isEmpty: "+pessoas.isEmpty());

		for(Pessoa pessoa : pessoas){
			System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
		}

		
	}

}
