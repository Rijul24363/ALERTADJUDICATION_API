package com.cf.manipal.api.controller.v1;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cf.manipal.api.model.Alert;
import com.cf.manipal.api.model.AlertTask;
import com.cf.manipal.api.model.CommonAlert;
import com.cf.manipal.api.repository.AlertRepository;
import com.cf.manipal.api.repository.AlertTaskRepository;
import com.cf.manipal.api.service.AlertService;

//@Log4j2
@RestController
@RequestMapping("/v1")

public class SampleController {
	
	private AlertService alertService;

    @Autowired
    public SampleController(AlertService alertService){
        this.alertService=alertService;
    }	
    
    @Autowired
    private AlertRepository repository;
    
    @Autowired
    private AlertTaskRepository alertRepository;
	
	@RequestMapping(value="/create", method = RequestMethod.POST, consumes="application/json")
	public ResponseEntity<String> createAlert(@RequestBody CommonAlert commonAlert) {
		List<Alert> alertList = commonAlert.getAlert();
	    List<AlertTask> alertTaskList = commonAlert.getAlertTask();

	    
	    for (Alert alert : alertList) {
	        Alert savedAlert = repository.save(alert);
	        
	    }

	    // Process AlertTaskDTO and save into the Task_Details table
	    for (AlertTask alertTask : alertTaskList) {
	        AlertTask savedAlertTask = alertRepository.save(alertTask);
	        
	    }

	    // Return a success response
	    return ResponseEntity.ok("Data saved successfully");
	}
    
	

}
