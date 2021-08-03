package br.com.fiap.investimento.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringListTest {

	public static void main(String[] args) {
		
		ArrayList<String> listaArray = new ArrayList<String>();
		
		LinkedList<String> listaLinked = new LinkedList<>();
		listaLinked.add("Victor");
		listaLinked.add("Flávio");
		listaLinked.add("Giovanna");
		listaLinked.add("Marihá");
		
		for (String nome : listaLinked) {
			System.out.println(nome);
		}
		
		
		
		
		
		
//		ArrayList<String> lista = new ArrayList<String>();
//		lista.add("Victor");
//		lista.add("Flávio");
//		lista.add("Giovanna");
//		lista.add("Marihá");
//		
//		lista.add(2, "Lucas");
//		lista.set(1, "Moreni");
//		
//		
//		// foreach	
//		for (String nome : lista) {
//			System.out.println(nome);
//		}
//		
//		System.out.println(lista.contains("Giovana"));
//		System.out.println(lista.contains("Giovanna"));
//		
//		System.out.println(lista.indexOf("Flávio"));
//		System.out.println(lista.indexOf("Marihá"));
//		System.out.println(lista.indexOf("Ederson"));
//		
//		
//		
//		lista.remove("Marihá");
		
		
		
		/*
		//for básico
		for(int i=0; i<lista.size();i++) {
			String nome = (String) lista.get(i);
			System.out.println(nome);
		}
			
		// iterator
		Iterator<String> ite = lista.iterator();
		while(ite.hasNext()) {
			String nome = ite.next();
			System.out.println(nome);
		}
		 */

	}

}
