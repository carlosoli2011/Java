package br.com.dextraining.domain;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

	// lista de funcionarios static
	static List<Funcionario> funcionarioList = new ArrayList<>();

	public static void salvar(Funcionario funcionario) {

		funcionarioList.add(funcionario);
	}

	public static List<Funcionario> listarTodos() {
		return funcionarioList;
	}

}
