package com.cf.manipal.api.model;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import com.cf.manipal.api.dto.AlertDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class that implements the Account structure.
 * 
 */
@Entity
@Table(name = "CASE_NOTIFICATION_HISTORY", schema="CRPROD")
public class Alert implements Serializable {

	private static final long serialVersionUID = -6762432601286928295L;
	
	@Id
	@Column(name = "SERIAL_NO")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serialNo;
	
	@Column(name = "CASE_ID")
	private Long caseId;
	
	@Column(name = "SENDER_ID")
	private String senderId;
	
	@Column(name = "RECOMMENDATION")
	private String recommendation;
	
	@Column(name = "ACTION")
	private String action;
	
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public Long getCaseId() {
		return caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Alert(Long caseId, Long serialNo, String senderId, String recommendation, String action) {
		this.caseId = caseId;
		this.serialNo= serialNo;
		this.senderId = senderId;
		this.recommendation = recommendation;
		this.action = action;
		}

	public Alert() {
		// TODO Auto-generated constructor stub
	}

	
	public AlertDTO convertEntityToDTO() {
		return new ModelMapper().map(this, AlertDTO.class);
	}
}
