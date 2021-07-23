package br.com.fiap.investimento.business;

public abstract class OperacoesBusiness {
	
	public void aplicar () {
		System.out.println("Solicitando a autenticacão via QRCode");
		System.out.println("Autenticacão efetuada para aplicacão");
		System.out.println("Geral - Aplicacão efetuada com sucesso");
		System.out.println("Token gerado com sucesso");
		System.out.println(this.getClass());
	}
	
	public void resgatar() {
		System.out.println("Geral - Resgate efetuado com sucesso");
		System.out.println("Token gerado com sucesso");
	}
	
	public void exibirExtrato() {
		System.out.println("Imprimindo o extrato na tela");
		System.out.println("Trilha de auditoria de impressão do extrato");
	}
	
}
