package com.java.crime.model;

import java.sql.Date;
import java.util.Objects;

public class Victims {

	private Integer VictimID ;
    private String FirstName ;
    private String LastName ;
    private Date DateOfBirth ;
    private Gender gender;
    private String PhoneNumber ;
    private String Address ;
	public Integer getVictimID() {
		return VictimID;
	}
	public void setVictimID(Integer victimID) {
		VictimID = victimID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Victims [VictimID=" + VictimID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", PhoneNumber=" + PhoneNumber + ", Address="
				+ Address + "]";
	}
	public Victims(Integer victimID, String firstName, String lastName, Date dateOfBirth, Gender gender,
			String phoneNumber, String address) {
		super();
		VictimID = victimID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public Victims() {
		super();
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DateOfBirth, FirstName, LastName, PhoneNumber, VictimID, gender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Victims other = (Victims) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(PhoneNumber, other.PhoneNumber) && Objects.equals(VictimID, other.VictimID)
				&& gender == other.gender;
	}
	
    
    
}
 