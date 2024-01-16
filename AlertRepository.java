package com.cf.manipal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.manipal.api.model.Alert;

/**
 * Interface that implements the Account Repository, with JPA CRUD methods.
 *  
 */

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {

	//Optional<Alert> findByCaseId(String caseId);
}
