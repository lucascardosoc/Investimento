package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorMapTest {

	public static void main(String[] args) {
		InvestidorPF[] arrayList = new InvestidorPF[10];
		List<InvestidorPF> lista = new ArrayList<>();
		Set<InvestidorPF> setlist = new HashSet<>();
		
		// Map 
		Map<String, String> mapaNomes = new TreeMap<String, String>();
		mapaNomes.put("chave 2", "valor 2");
		mapaNomes.put("chave 3", "valor 3");
		mapaNomes.put("chave 1", "valor 1");
		mapaNomes.put("chave 2", "valor 22");
		mapaNomes.put("chave 2", "valor 222");
		
		System.out.println(mapaNomes);
		
	}

}
