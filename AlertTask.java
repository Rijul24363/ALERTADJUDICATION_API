package com.cf.manipal.api.model;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import com.cf.manipal.api.dto.AlertTaskDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TASK_DETAILS", schema="VIZPROD")

public class AlertTask implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1664424520692104544L;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSACTION_REFERENCE_NUMBER")
	private Long transactionReferenceNumber;
	
	public Long getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}

	public void setTransactionReferenceNumber(Long transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}

	@Column(name = "STATUS")
	private String status;

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public AlertTask(Long transactionReferenceNumber, String status) {
		this.transactionReferenceNumber = transactionReferenceNumber;
		this.status = status;
	}
	
	public AlertTask() {
		// TODO Auto-generated constructor stub
	}
	
	public AlertTaskDTO convertEntityToDTO() {
		return new ModelMapper().map(this, AlertTaskDTO.class);
	}

}
