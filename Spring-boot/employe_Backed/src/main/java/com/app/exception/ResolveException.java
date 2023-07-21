package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResolveException extends RuntimeException {

	
	private static final long seriaVersionUID = 1L;
	
	public ResolveException(String massage ) {
		super(massage);
	}
}
