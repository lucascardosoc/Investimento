package br.com.fiap.investimento.model;

public class InvestidorInstitucional extends InvestidorPJ {

	private String nomeResponsavelLegal;

	public String getNomeResponsavelLegal() {
		return nomeResponsavelLegal;
	}

	public void setNomeResponsavelLegal(String nomeResponsavelLegal) {
		this.nomeResponsavelLegal = nomeResponsavelLegal;
	}

	@Override
	public String toString() {
		return "InvestidorInstitucional [getNomeResponsavelLegal()=" + getNomeResponsavelLegal() + ", getCnpj()="
				+ getCnpj() + ", toString()=" + super.toString() + ", getInvestidorId()=" + getInvestidorId()
				+ ", getNome()=" + getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()="
				+ getPerfilRisco() + ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}
	
}
