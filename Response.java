package com.cf.manipal.api.dto.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Class that implements a generic response to the API end-points.
 * 
 *
 * @param <T>
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	private T data;
	private Object errors;
	
	
    public void addErrorMsgToResponse(String msgError) {
        ResponseError error = new ResponseError();
        error.setDetails(msgError);
        error.setTimestamp(LocalDateTime.now());
        setErrors(error);
    }
}
