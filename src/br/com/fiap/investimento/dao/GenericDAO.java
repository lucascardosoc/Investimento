package br.com.fiap.investimento.dao;

import java.util.List;

public interface GenericDAO<E extends Object, I> {

	public List<E> listarTodos();
	
	public E consultarPorId(I chave);
	
	public I cadastrar(E entidade);
	
	public void alterar(E entidade);
	
	public void excluir(I chave);
	
}
