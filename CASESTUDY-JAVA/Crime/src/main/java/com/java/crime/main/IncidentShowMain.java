package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class IncidentShowMain {
	public static void main(String[] args) {
		
		IncidentsDao dao = new IncidentsDaoImpl();
	try {
		List<Incidents> incidentsList = dao.showIncidentDao() ;
		for (Incidents incidents : incidentsList) {
			System.out.println(incidents);
		}
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}