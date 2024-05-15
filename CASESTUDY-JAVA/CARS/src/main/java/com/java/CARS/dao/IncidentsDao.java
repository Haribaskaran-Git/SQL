package com.java.CARS.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.CARS.model.Incidents;

public interface IncidentsDao {
	
	List<Incidents> showIncidentDao() throws ClassNotFoundException, SQLException;
	Incidents searchByIncidentId(int  IncidentId) throws ClassNotFoundException, SQLException;

}
