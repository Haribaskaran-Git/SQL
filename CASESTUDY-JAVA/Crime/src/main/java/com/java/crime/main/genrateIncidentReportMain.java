package com.java.crime.main;
import java.sql.SQLException;
import java.util.List;

import com.java.crime.dao.*;
import com.java.crime.model.Incidents;

public class genrateIncidentReportMain {
	public static void main(String[] args) {
		
		IncidentsDao dao=new IncidentsDaoImpl();
		  try {
			List<Incidents> IncidentList =  dao.genrateIncidentReport();
			for (Incidents incidents : IncidentList) {
				System.out.println(incidents);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}