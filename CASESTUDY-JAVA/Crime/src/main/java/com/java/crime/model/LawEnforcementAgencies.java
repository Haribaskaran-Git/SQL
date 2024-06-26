package com.java.crime.model;

import java.util.Objects;

public class LawEnforcementAgencies {
	private Integer AgencyID ;
	private String AgencyName;
	private String Jurisdiction ;
	private String PhoneNumber ;
	private String Address;
	public Integer getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(Integer agencyID) {
		AgencyID = agencyID;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public String getJurisdiction() {
		return Jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		Jurisdiction = jurisdiction;
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
		return "LawEnforcementAgencies [AgencyID=" + AgencyID + ", AgencyName=" + AgencyName + ", Jurisdiction="
				+ Jurisdiction + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + "]";
	}
	public LawEnforcementAgencies(Integer agencyID, String agencyName, String jurisdiction, String phoneNumber,
			String address) {
		super();
		AgencyID = agencyID;
		AgencyName = agencyName;
		Jurisdiction = jurisdiction;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public LawEnforcementAgencies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, AgencyID, AgencyName, Jurisdiction, PhoneNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    LawEnforcementAgencies law = (LawEnforcementAgencies) obj;
	    return Objects.equals(AgencyID, law.AgencyID) &&
	           Objects.equals(AgencyName, law.AgencyName) &&
	           Objects.equals(Jurisdiction, law.Jurisdiction) &&
	           Objects.equals(PhoneNumber, law.PhoneNumber) &&
	           Objects.equals(Address, law.Address);
	}

	
}
	


