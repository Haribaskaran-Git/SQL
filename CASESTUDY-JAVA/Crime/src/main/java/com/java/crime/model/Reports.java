package com.java.crime.model;

import java.sql.Date;
import java.util.Objects;

public class Reports {

	private Integer ReportID ;
	private Integer IncidentID ;
	private Integer ReportingOfficer;
	private Date ReportDate;
	private String ReportDetails ;
	private String Status ;
	public Integer getReportID() {
		return ReportID;
	}
	public void setReportID(Integer reportID) {
		ReportID = reportID;
	}
	public Integer getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(Integer incidentID) {
		IncidentID = incidentID;
	}
	public Integer getReportingOfficer() {
		return ReportingOfficer;
	}
	public void setReportingOfficer(Integer reportingOfficer) {
		ReportingOfficer = reportingOfficer;
	}
	public Date getReportDate() {
		return ReportDate;
	}
	public void setReportDate(Date reportDate) {
		ReportDate = reportDate;
	}
	public String getReportDetails() {
		return ReportDetails;
	}
	public void setReportDetails(String reportDetails) {
		ReportDetails = reportDetails;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Reports [ReportID=" + ReportID + ", IncidentID=" + IncidentID + ", ReportingOfficer=" + ReportingOfficer
				+ ", ReportDate=" + ReportDate + ", ReportDetails=" + ReportDetails + ", Status=" + Status + "]";
	}
	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reports(Integer reportID, Integer incidentID, Integer reportingOfficer, Date reportDate,
			String reportDetails, String status) {
		super();
		ReportID = reportID;
		IncidentID = incidentID;
		ReportingOfficer = reportingOfficer;
		ReportDate = reportDate;
		ReportDetails = reportDetails;
		Status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(IncidentID, ReportDate, ReportDetails, ReportID, ReportingOfficer, Status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reports other = (Reports) obj;
		return Objects.equals(IncidentID, other.IncidentID) && Objects.equals(ReportDate, other.ReportDate)
				&& Objects.equals(ReportDetails, other.ReportDetails) && Objects.equals(ReportID, other.ReportID)
				&& Objects.equals(ReportingOfficer, other.ReportingOfficer) && Objects.equals(Status, other.Status);
	}
	
	
}
