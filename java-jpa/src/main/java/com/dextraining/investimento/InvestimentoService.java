package com.dextraining.investimento;

import com.dextraining.exception.ValidacaoException;
import com.dextraining.pessoa.Pessoa;
import com.dextraining.service.GenericService;

public class InvestimentoService extends GenericService<Investimento>{

	public InvestimentoService() {
		// TODO Auto-generated constructor stub
		super(Investimento.class);
	}
	
	//sobrescrita de metodo
	@Override
	public void salvar(Investimento investimento){
		if(investimento.getDescricao() == null || investimento.getDescricao().isEmpty()){//se for nulo faca
			throw new ValidacaoException("Descrição não pode estar vazio");
		}
		if(investimento.getValor() == null || investimento.getValor() <=0){
			throw new ValidacaoException("Valor invalido");
		}
		if(investimento.getRendimentoMensal() == null || investimento.getRendimentoMensal() <=0){
			throw new ValidacaoException("Rendimento Mensal não pode estar vazio");
		}
		super.salvar(investimento);
	}
	

}
