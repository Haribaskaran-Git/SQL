package com.java.crime.model;

import java.sql.Date;
import java.util.Objects;

public class Incidents {
	private Integer IncidentID;
    private String IncidentType ;
    private Date IncidentDate ;
    private Double Latitude ;
    private Double Longitude;
    private String Description ;
    private String Status ;
    private Integer VictimID ;
    private Integer SuspectID ;
    private Integer AgencyID ;
	public Integer getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(Integer incidentID) {
		IncidentID = incidentID;
	}
	public String getIncidentType() {
		return IncidentType;
	}
	public void setIncidentType(String incidentType) {
		IncidentType = incidentType;
	}
	public Date getIncidentDate() {
		return IncidentDate;
	}
	public void setIncidentDate(Date incidentDate) {
		IncidentDate = incidentDate;
	}
	public Double getLatitude() {
		return Latitude;
	}
	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
	public Double getLongitude() {
		return Longitude;
	}
	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Integer getVictimID() {
		return VictimID;
	}
	public void setVictimID(Integer victimID) {
		VictimID = victimID;
	}
	public Integer getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(Integer suspectID) {
		SuspectID = suspectID;
	}
	public Integer getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(Integer agencyID) {
		AgencyID = agencyID;
	}
	@Override
	public String toString() {
		return "Incidents [IncidentID=" + IncidentID + ", IncidentType=" + IncidentType + ", IncidentDate="
				+ IncidentDate + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Description=" + Description
				+ ", Status=" + Status + ", VictimID=" + VictimID + ", SuspectID=" + SuspectID + ", AgencyID="
				+ AgencyID + "]";
	}
	public Incidents() {
		
	}
	public Incidents(Integer incidentID, String incidentType, Date incidentDate, Double latitude, Double longitude,
			String description, String status, Integer victimID, Integer suspectID, Integer agencyID) {
		
		IncidentID = incidentID;
		IncidentType = incidentType;
		IncidentDate = incidentDate;
		Latitude = latitude;
		Longitude = longitude;
		Description = description;
		Status = status;
		VictimID = victimID;
		SuspectID = suspectID;
		AgencyID = agencyID;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(IncidentID, Description, IncidentDate,  IncidentType, Latitude, Longitude, Status,
				SuspectID, VictimID,AgencyID);
	}
//	@Override
//	public boolean equals(Object obj) {
//		Incidents incidents = (Incidents)obj;
//		if(incidents.getIncidentID() == IncidentID && incidents.getDescription() == Description && incidents.getIncidentDate()
//				== IncidentDate && incidents.getIncidentType() == IncidentType && incidents.getLatitude() == Latitude
//				 && incidents.getLongitude() == Longitude && incidents.getStatus() == Status && incidents.getSuspectID()
//				 == SuspectID && incidents.getVictimID() == VictimID && incidents.getAgencyID() == AgencyID) {
//			return true;
//		}
//		return false;
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Incidents incidents = (Incidents) obj;
	    return Objects.equals(IncidentID, incidents.IncidentID) &&
	           Objects.equals(IncidentType, incidents.IncidentType) &&
	           Objects.equals(IncidentDate, incidents.IncidentDate) &&
	           Objects.equals(Latitude, incidents.Latitude) &&
	           Objects.equals(Longitude, incidents.Longitude) &&
	           Objects.equals(Description, incidents.Description) &&
	           Objects.equals(Status, incidents.Status) &&
	           Objects.equals(VictimID, incidents.VictimID) &&
	           Objects.equals(SuspectID, incidents.SuspectID) &&
	           Objects.equals(AgencyID, incidents.AgencyID);
	}
	
    
}
