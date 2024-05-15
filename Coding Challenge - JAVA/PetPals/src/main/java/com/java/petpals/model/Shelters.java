package com.java.petpals.model;

public class Shelters {
	private Integer ShelterID ;
	private String Name ;
	private String Location ;
	public Integer getShelterID() {
		return ShelterID;
	}
	public void setShelterID(Integer shelterID) {
		ShelterID = shelterID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	@Override
	public String toString() {
		return "Shelters [ShelterID=" + ShelterID + ", Name=" + Name + ", Location=" + Location + "]";
	}
	public Shelters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shelters(Integer shelterID, String name, String location) {
		super();
		ShelterID = shelterID;
		Name = name;
		Location = location;
	}
	
}
