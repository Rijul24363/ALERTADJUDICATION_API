package com.cf.manipal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.manipal.api.model.AlertTask;

@Repository
public interface AlertTaskRepository extends JpaRepository<AlertTask, Long> {

}
