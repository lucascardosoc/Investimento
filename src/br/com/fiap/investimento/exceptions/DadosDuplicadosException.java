package br.com.fiap.investimento.exceptions;

public class DadosDuplicadosException extends Exception {

	public DadosDuplicadosException() {
	}

	public DadosDuplicadosException(String message) {
		super(message);
	}

	public DadosDuplicadosException(Throwable cause) {
		super(cause);
	}

	public DadosDuplicadosException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadosDuplicadosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
