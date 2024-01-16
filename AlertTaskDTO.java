package com.cf.manipal.api.dto;

import org.modelmapper.ModelMapper;

import com.cf.manipal.api.model.AlertTask;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlertTaskDTO {
	
	@JsonProperty(value="transactionreferencenumber")
	private Long transactionreferencenumber;
	@JsonProperty(value="status")
	private String status;
	public Long getTransactionreferencenumber() {
		return transactionreferencenumber;
	}
	public void setTransactionreferencenumber(Long transactionreferencenumber) {
		this.transactionreferencenumber = transactionreferencenumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public AlertTask convertDTOToEntity() {
		return new ModelMapper().map(this, AlertTask.class);
	}

}
