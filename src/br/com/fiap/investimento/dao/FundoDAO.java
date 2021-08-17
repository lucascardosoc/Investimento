package br.com.fiap.investimento.dao;

import java.util.List;

import br.com.fiap.investimento.model.Fundo; 

public class FundoDAO implements GenericDAO<Fundo, Integer> {

	@Override
	public List<Fundo> listarTodos() {
		return null;
	}

	@Override
	public Fundo consultarPorId(Integer chave) {
		return null;
	}
	
}
