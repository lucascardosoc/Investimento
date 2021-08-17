package br.com.fiap.investimento.dao;

import java.util.List;

// Investidor -- Fundo
public interface GenericDAO<E extends Object, I> {

	public List<E> listarTodos();
	
	public E consultarPorId(I chave);
	
}
