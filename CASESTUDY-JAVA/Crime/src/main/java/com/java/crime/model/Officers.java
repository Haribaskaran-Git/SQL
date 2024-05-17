package com.java.crime.model;

import java.util.Objects;

public class Officers {

	private Integer OfficerID ;
	private String FirstName ;
	private String LastName ;
	private String BadgeNumber ;
	private String Ranking ;
	private String PhoneNumber ;
	private String Address ;
	private Integer AgencyID ;
	public Integer getOfficerID() {
		return OfficerID;
	}
	public void setOfficerID(Integer officerID) {
		OfficerID = officerID;
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
	public String getBadgeNumber() {
		return BadgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		BadgeNumber = badgeNumber;
	}
	public String getRanking() {
		return Ranking;
	}
	public void setRanking(String ranking) {
		Ranking = ranking;
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
	public Integer getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(Integer agencyID) {
		AgencyID = agencyID;
	}
	@Override
	public String toString() {
		return "Officers [OfficerID=" + OfficerID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", BadgeNumber=" + BadgeNumber + ", Ranking=" + Ranking + ", PhoneNumber=" + PhoneNumber
				+ ", Address=" + Address + ", AgencyID=" + AgencyID + "]";
	}
	public Officers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Officers(Integer officerID, String firstName, String lastName, String badgeNumber, String ranking,
			String phoneNumber, String address, Integer agencyID) {
		super();
		OfficerID = officerID;
		FirstName = firstName;
		LastName = lastName;
		BadgeNumber = badgeNumber;
		Ranking = ranking;
		PhoneNumber = phoneNumber;
		Address = address;
		AgencyID = agencyID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, AgencyID, BadgeNumber, FirstName, LastName, OfficerID, PhoneNumber, Ranking);
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Officers other = (Officers) obj;
	    return Objects.equals(OfficerID, other.OfficerID) &&
	           Objects.equals(FirstName, other.FirstName) &&
	           Objects.equals(LastName, other.LastName) &&
	           Objects.equals(BadgeNumber, other.BadgeNumber) &&
	           Objects.equals(Ranking, other.Ranking) &&
	           Objects.equals(PhoneNumber, other.PhoneNumber) &&
	           Objects.equals(Address, other.Address) &&
	           Objects.equals(AgencyID, other.AgencyID);
	}

	
	
}
