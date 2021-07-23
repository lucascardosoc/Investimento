package br.com.fiap.investimento.business;

public abstract class OperacoesBusiness {
	
	public void aplicar () {
		System.out.println("Solicitando a autenticac�o via QRCode");
		System.out.println("Autenticac�o efetuada para aplicac�o");
		System.out.println("Geral - Aplicac�o efetuada com sucesso");
		System.out.println("Token gerado com sucesso");
		System.out.println(this.getClass());
	}
	
	public void resgatar() {
		System.out.println("Geral - Resgate efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
	public void exibirExtrato() {
		System.out.println("Imprimindo o extrato na tela");
		System.out.println("Trilha de auditoria de impress�o do extrato");
	}
	
}
