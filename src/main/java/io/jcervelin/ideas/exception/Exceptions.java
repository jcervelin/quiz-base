package io.jcervelin.ideas.exception;

import io.jcervelin.ideas.exception.http.ExceptionsHttp;
import io.jcervelin.ideas.exception.http.UnprocessableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.VndErrors.VndError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


@RestControllerAdvice
public class Exceptions {

	private static final Logger logger = LoggerFactory.getLogger(Exceptions.class);

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public VndError constraintViolationException(ConstraintViolationException exception) {
		return criarMensagem(HttpStatus.BAD_REQUEST.value(), exception);
	}

	@ExceptionHandler(IllegalStateException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public VndError illegalStateException(IllegalStateException exception) {
		return criarMensagem(HttpStatus.BAD_REQUEST.value(), exception);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public VndError illegalArgumentException(IllegalArgumentException exception) {
		return criarMensagem(HttpStatus.BAD_REQUEST.value(), exception);
	}

	@ExceptionHandler(UnprocessableEntity.class)
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	public VndError illegalArgumentException(UnprocessableEntity exception) {
		return criarMensagem(HttpStatus.UNPROCESSABLE_ENTITY.value(), exception);
	}

	/* Metodo para mostrar mais amigavel alguns erros http */
	@ExceptionHandler(ExceptionsHttp.class)
	public ResponseEntity<?> excecoesHttp(ExceptionsHttp exception) {
		return new ResponseEntity<>(criarMensagem(exception.getStatus().value(), exception), exception.getStatus());
	}

	private VndError criarMensagem(Integer status, RuntimeException exception) {
		logger.error(exception.getMessage(), exception);
		return new VndError(status.toString(), exception.getMessage());
	}
}