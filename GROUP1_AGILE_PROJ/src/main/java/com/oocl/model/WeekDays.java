package com.oocl.model;

import java.util.ArrayList;

public class WeekDays {
	

	TimeSlot timeSlot;
	public WeekDays(){
		
		this.timeSlot = new TimeSlot();
		
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}


}
