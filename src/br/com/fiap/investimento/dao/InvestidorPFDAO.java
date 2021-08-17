package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorPFDAO implements GenericDAO<InvestidorPF, Integer>{
	

	public List<InvestidorPF> listarTodos() {
		
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conexão
		// Preparando o comando SQL
		// >>>> SELECT * FROM TB_INVESTIDOR
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Integrando o retorno SQL com o Java
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Flávio", 11));
		investidores.add(new InvestidorPF("Marihá", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));
		
		return investidores;
		
		// Fechando a conexão
	}
	

	@Override
	public InvestidorPF consultarPorId(Integer chave) {
		return null;
	}

	@Override
	public Integer cadastrar(InvestidorPF entidade) {
		return null;
	}

	@Override
	public void alterar(InvestidorPF entidade) {
		
	}

	@Override
	public void excluir(Integer chave) {
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conexão
		// Preparando o comando SQL
		// >>>> DELET FROM TB_INVESTIDOR WHERE  ID_INVESTIDOR = chave
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Retorno sucesso ou falha
		System.out.println("Investidor excluído com sucesso: " + chave);
	}
}


