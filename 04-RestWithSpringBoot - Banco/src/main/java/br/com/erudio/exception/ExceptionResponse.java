package br.com.erudio.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date timestemp;
	private String message;
	private String details;

	public ExceptionResponse(Date timestemp, String message, String details) {
		this.timestemp = timestemp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestemp() {
		return timestemp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
