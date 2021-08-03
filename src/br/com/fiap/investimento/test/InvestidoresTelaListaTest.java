package br.com.fiap.investimento.test;

import java.util.ArrayList;

import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidoresTelaListaTest {

	public static void main(String[] args) {
		
		InvestidorPFDAO dao = new InvestidorPFDAO();
		ArrayList<InvestidorPF> lista = dao.listarTodos();
		
		for (InvestidorPF investidorPF : lista) {
			System.out.println(investidorPF);
		}

	}

}
