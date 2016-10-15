package list;

import java.util.Comparator;

public class PessoaPorCpfComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		// TODO 
		pessoa.getCpf().compareTo(outraPessoa.getCpf());
		return 0;
	}
	
	

}
