package io.jcervelin.ideas.exception.http;

import org.springframework.http.HttpStatus;

public class UnprocessableEntity extends ExceptionsHttp {

	private static final long serialVersionUID = 1L;

	public UnprocessableEntity(){
		super("Entity cannot be processed");
	}
	
	public UnprocessableEntity(String message){
		super(message,HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	
}
