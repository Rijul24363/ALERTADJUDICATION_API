package com.cf.manipal.api.service;

import org.springframework.stereotype.Service;

import com.cf.manipal.api.dto.AlertDTO;
import com.cf.manipal.api.exception.AlertNotFoundException;

@Service
public interface AlertService {
	
	void actualBusinessRequirement();
	
	/**
	 * Method that saves an account in the database.
	 * 
	 * 
	 * @param account
	 * @return <code>Account</code> object
	 */
	//Alert save(Alert account);
	
	/**
	 * Method that find an account by accountNumber in the database.
	 * 
	 * 
	 * @param accountNumber
	 * @return Optional<Account> object
	 */
	//AlertDTO findByCaseId(String caseId) throws AlertNotFoundException;

	AlertDTO findById(Long accountId) throws AlertNotFoundException;
	// AlertDTO createAlert(AlertDTO alertDTO);

	//AlertDTO updateAlertStatus(AlertDTO alertDTO);

}
