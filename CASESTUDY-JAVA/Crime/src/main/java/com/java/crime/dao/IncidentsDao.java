package com.java.crime.dao;

import java.sql.Date;

import java.sql.SQLException;
import java.util.List;

import com.java.crime.model.Incidents;
import com.java.crime.model.Reports;

public interface IncidentsDao {
	
	List<Incidents> showIncidentDao() throws ClassNotFoundException, SQLException;
	Incidents searchByIncidentId(int  IncidentID) throws ClassNotFoundException, SQLException;
	List<Incidents> getIncidentsDateRange(Date startDate, Date endDate) throws ClassNotFoundException, SQLException;
	List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException;
	Boolean updateIncidentStatus(String Status, int IncidentID) throws ClassNotFoundException, SQLException;
	List<Incidents> genrateIncidentReport() throws ClassNotFoundException, SQLException;
	Boolean CreateIncident(Incidents incident) throws ClassNotFoundException, SQLException;
	List<Incidents> SearchIncidentsById(int IncidentID) throws ClassNotFoundException, SQLException;

	
	
}
