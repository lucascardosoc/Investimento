package br.com.fiap.investimento.reports;

public interface Report {
	
	public void print(String redeImpessora);
	
	public void pdf();
	
	public void excel();
	
	public void txt();

}