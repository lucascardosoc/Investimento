package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorPFDAO {
	
//	entrada >> processamento >> sa�da

	// cadastrar - INSERT
	public boolean cadastrar(InvestidorPF investidor) {
		// ptocessamento - Comando SQL
		return true;
	}
	
	
	// alterar - UPDATE
	
	// excluir - DELETE
	
	
	
	// consultar - SELECT BY ID
	public InvestidorPF consultarPorId(int id) {
		// processamento
		return new InvestidorPF();
	}
	
	public InvestidorPF consultarPorCpf(String cpf) {
		// processamento
		return new InvestidorPF();
	}
	
	// listarTodos - SELECT ALL
	public List<InvestidorPF> listarTodos() {
		
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conex�o
		// Preparando o comando SQL
		// >>>> SELECT * FROM TB_INVESTIDOR
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Integrando o retorno SQL com o Java
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Fl�vio", 11));
		investidores.add(new InvestidorPF("Marih�", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));
		
		return investidores;
		
		// Fechando a conex�o
	}
}
