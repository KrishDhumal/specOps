package com.zs.excep;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidUserException extends RuntimeException {

	public InvalidUserException() {
	}

	public InvalidUserException(String message) {
		super(message);
	}
}
