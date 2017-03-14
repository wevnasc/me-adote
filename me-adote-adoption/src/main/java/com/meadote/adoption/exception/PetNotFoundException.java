package com.meadote.adoption.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PetNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PetNotFoundException(long id) {
		super("could not find pet '" + id + "'.");
	}
}
