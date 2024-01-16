package com.cf.manipal.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cf.manipal.api.dto.AlertDTO;
import com.cf.manipal.api.exception.AlertNotFoundException;
import com.cf.manipal.api.model.Alert;
import com.cf.manipal.api.repository.AlertRepository;
import com.cf.manipal.api.service.AlertService;

/**
 * Class that implements the account service methods
 * 
 */

@Service
public class AlertServiceImpl implements AlertService {
	
	@Autowired
	AlertRepository repository;

	@Override
	public void actualBusinessRequirement() {
		// Whatever you have to do, do it here.
	}
	
	/**
	 * @throws AlertNotFoundException 
	 * @see AlertService#findByAccountNumber(String)
	 */
//	@Override
//	@Transactional
//	public AlertDTO findByCaseId(String caseId) throws AlertNotFoundException {
//		Optional<Alert> optionalAcct = repository.findByCaseId(caseId);
//		if (optionalAcct.isEmpty()) { 
//			throw new AlertNotFoundException("There are no alerts registered with this accountNumber=" + caseId);
//		}
//		
//		return optionalAcct.get().convertEntityToDTO();
//		
////		List<AlertDTO> alertDTO = new ArrayList<>();
////		optionalAcct.stream().forEach(t -> alertDTO.add(t.convertEntityToDTO()));
////			return alertDTO.get(0);
//	
//	}
	/**
	 * @see AlertService#findById(Long)
	 */
	@Override
	public AlertDTO findById(Long accountId) throws AlertNotFoundException {
		Optional<Alert> optionalAcct = repository.findById(accountId);
//		if (optionalAcct.isEmpty()) { 
//			throw new AlertNotFoundException("There are no alerts registered with this accountNumber=" + accountId);
//		}
		
		List<AlertDTO> alertDTO = new ArrayList<>();
		//optionalAcct.stream().forEach(t -> alertDTO.add(t.convertEntityToDTO()));
			return alertDTO.get(0);
	}
	
//	  @Transactional
//	    public AlertDTO updateAlertStatus(AlertDTO alertDTO) {
//	        Alert alert = new Alert(alertDTO.getCaseId(), alertDTO.getSerialNo(), alertDTO.getSenderId(), alertDTO.getRecommendation());
//	        Alert savedAlert = repository.save(alert);
//	        return savedAlert.convertEntityToDTO();
//	    }

	

}
