package com.java.petpals.model;

import java.sql.Date;

public class AdoptionEvents {
	 private Integer EventID;
	 private String EventName;
	 private Date EventDate;
	 private String Location;
	public Integer getEventID() {
		return EventID;
	}
	public void setEventID(Integer eventID) {
		EventID = eventID;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public Date getEventDate() {
		return EventDate;
	}
	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	@Override
	public String toString() {
		return "AdoptionEvents [EventID=" + EventID + ", EventName=" + EventName + ", EventDate=" + EventDate
				+ ", Location=" + Location + "]";
	}
	public AdoptionEvents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdoptionEvents(Integer eventID, String eventName, Date eventDate, String location) {
		super();
		EventID = eventID;
		EventName = eventName;
		EventDate = eventDate;
		Location = location;
	}
	 
	    
}
