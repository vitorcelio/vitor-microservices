package br.com.vitor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NaoSuportaEssaOperacao extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NaoSuportaEssaOperacao(String exception) {
		// TODO Auto-generated constructor stub
		super(exception);
	}
}
