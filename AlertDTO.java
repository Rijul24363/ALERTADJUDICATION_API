package com.cf.manipal.api.dto;

import org.modelmapper.ModelMapper;

import com.cf.manipal.api.model.Alert;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlertDTO  {
	
	@JsonProperty(value="caseId")
	private Long caseId;
	@JsonProperty(value="serialNo")
	private Long serialNo;
	@JsonProperty(value="senderId")
	private String senderId;
	@JsonProperty(value="recommendation")
	private String recommendation;
	@JsonProperty(value="action")
	private String action;
	

	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}


	public Long getCaseId() {
		return caseId;
	}
	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}



	public Long getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}



	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}



	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}



	
	public Alert convertDTOToEntity() {
		return new ModelMapper().map(this, Alert.class);
	}
}
