package com.cf.manipal.api.dto.response;

import java.time.LocalDateTime;

/**
 * Class that implements a generic response error object to the API end-points.
 * 
 */

public class ResponseError {
	
	
	private LocalDateTime timestamp;
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
    private String details;

}