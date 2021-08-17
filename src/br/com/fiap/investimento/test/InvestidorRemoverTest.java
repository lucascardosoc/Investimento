package br.com.fiap.investimento.test;

import br.com.fiap.investimento.dao.GenericDAO;
import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorRemoverTest {

	public static void main(String[] args) {

		try {
			// Investidor que ser� removido
			Integer idInvestidor = 100;
			GenericDAO<InvestidorPF, Integer> dao = new InvestidorPFDAO();
			dao.excluir(idInvestidor);
			System.out.println("Super Sucesso!");
		} catch (DadoNaoRemovidoException de) {
			System.out.println("N�o foi poss�vel remover o investidor. Digite o c�digo corretamente.");
		} catch (DataBaseException dbe) {
			System.out.println("Erro de acesso ao banco, n�o foi poss�vel remover o investidor.");
		}

	}

}
