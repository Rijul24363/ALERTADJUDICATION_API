package com.cf.manipal.api.model;

import java.util.List;

public class CommonAlert {
	
	    private List<Alert> alert;
	    private List<AlertTask> alertTask;

	    public List<Alert> getAlert() {
	        return alert;
	    }

	    public void setAlert(List<Alert> alert) {
	        this.alert = alert;
	    }

	    public List<AlertTask> getAlertTask() {
	        return alertTask;
	    }

	    public void setAlertTask(List<AlertTask> alertTask) {
	        this.alertTask = alertTask;
	    }

}
