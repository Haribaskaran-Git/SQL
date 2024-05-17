package com.java.crime.model;

import java.util.Objects;

public class Evidence {
	private Integer EvidenceID ;
	private String Description  ;
	private String LocationFound ;
    private Integer IncidentID;
	public Integer getEvidenceID() {
		return EvidenceID;
	}
	public void setEvidenceID(Integer evidenceID) {
		EvidenceID = evidenceID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocationFound() {
		return LocationFound;
	}
	public void setLocationFound(String locationFound) {
		LocationFound = locationFound;
	}
	public Integer getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(Integer incidentID) {
		IncidentID = incidentID;
	}
	@Override
	public String toString() {
		return "Evidence [EvidenceID=" + EvidenceID + ", Description=" + Description + ", LocationFound="
				+ LocationFound + ", IncidentID=" + IncidentID + "]";
	}
	public Evidence(Integer evidenceID, String description, String locationFound, Integer incidentID) {
	
		EvidenceID = evidenceID;
		Description = description;
		LocationFound = locationFound;
		IncidentID = incidentID;
	}
	public Evidence() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(Description, EvidenceID, IncidentID, LocationFound);
	}
	@Override
	public boolean equals(Object obj) {
		Evidence evidence = (Evidence)obj;
		if(evidence.getEvidenceID()==EvidenceID && evidence.getDescription()==Description && evidence.getLocationFound()
				== LocationFound && evidence.getIncidentID() == IncidentID) {
			return true;
		}
		return false;
	}
    

}
