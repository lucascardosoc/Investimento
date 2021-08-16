package br.com.fiap.investimento.test;

import java.util.HashSet;
import java.util.Set;

import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorSetTest {

	public static void main(String[] args) {
		
		Set<Fundo> fundos = new HashSet<>();
		fundos.add(new Fundo(1, "Fundo 1"));
		fundos.add(new Fundo(2, "Fundo 2"));
		fundos.add(new Fundo(1, "Fundo 1"));
		System.out.println(fundos);
		
		
		Set<InvestidorPF> investidores = new HashSet<>();
		investidores.add(new InvestidorPF("Inv 1", 10));
		investidores.add(new InvestidorPF("Inv 2", 20));
		investidores.add(new InvestidorPF("Inv 1", 10));
		System.out.println(investidores);
		
	}

}
