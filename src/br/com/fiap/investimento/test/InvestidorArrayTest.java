package br.com.fiap.investimento.test;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorArrayTest {

	public static void main(String[] args) {
		
		InvestidorPF investidores[] = new InvestidorPF[6];
		investidores[0] = new InvestidorPF("Flávio", 1);
		investidores[1] = new InvestidorPF("Felipe", 15000000);
		investidores[2] = new InvestidorPF("Marihá", 1);
		investidores[3] = new InvestidorPF("Daniel", 1);
		investidores[4] = new InvestidorPF("Guilherme", 1);
		investidores[5] = new InvestidorPF("Giovanna", 1);
		
		//removendo o felipe
		investidores[1] = null;
		
		for (InvestidorPF investidorPF : investidores) {
			System.out.println(investidorPF);
		}

	}

}
