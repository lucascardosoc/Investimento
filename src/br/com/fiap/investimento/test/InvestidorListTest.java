package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorListTest {

	public static void main(String[] args) {
		// List - Interface pai
		// ArrayList - Concreta
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Fl�vio", 11));
		investidores.add(new InvestidorPF("Marih�", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));

		for (InvestidorPF investidorPF : investidores) {
			System.out.println(investidorPF);
		}
		
		System.out.println(investidores.contains(new InvestidorPF("Fl�vio", 11)));
		
	}

}
