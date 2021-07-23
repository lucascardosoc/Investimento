package br.com.fiap.investimento.model;

public class InvestidorPJ extends Investidor {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "InvestidorPJ [getCnpj()=" + getCnpj() + ", getInvestidorId()=" + getInvestidorId() + ", getNome()="
				+ getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}
	
	
	
}
