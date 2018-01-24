package io.jcervelin.ideas.exception.http;

import org.springframework.http.HttpStatus;

public class BadRequestEntity extends ExceptionsHttp {

	private static final long serialVersionUID = 1L;

	public BadRequestEntity(){
		super("Entity cannot be processed");
	}
	
	public BadRequestEntity(String message){
		super(message,HttpStatus.BAD_REQUEST);
	}
	
	
}
