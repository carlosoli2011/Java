package br.com.dextraining.web.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.dextraining.domain.Funcionario;
import br.com.dextraining.domain.FuncionarioService;
import br.com.dextraining.domain.UsuarioService;

@ManagedBean(name="funcionarioMB")
public class FuncionarioMB {

	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> funcionarios;
	
	
	@PostConstruct
	public void carregar() {
		this.funcionarios = FuncionarioService.listarTodos();
	}
	
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
	public void salvar() {
		//metodo salvar
		FuncionarioService.salvar(funcionario);
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		try {
			ec.redirect("/listarFuncionarios.xhtml");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	//get sets
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
