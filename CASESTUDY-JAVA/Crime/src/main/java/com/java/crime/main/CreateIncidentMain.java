package com.java.crime.main;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.dao.IncidentsDao;
import com.java.crime.model.Incidents;

public class CreateIncidentMain {
	

	public static void main(String[] args) {
		
		Incidents incident=new Incidents();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter IncidentID");
		incident.setIncidentID(sc.nextInt());
		System.out.println("enter IncidentType");
		incident.setIncidentType(sc.next());
		System.out.print("Enter date (yyyy-MM-dd): ");
		String DateString=sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
			java.util.Date date = dateFormat.parse(DateString);
			 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			  incident.setIncidentDate(sqlDate);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		System.out.println("enter Latitude");
		incident.setLatitude(sc.nextDouble());
		System.out.println("enter Longitude");
		incident.setLongitude(sc.nextDouble());
		
		System.out.println("enter status");
		incident.setStatus(sc.next());
		System.out.println("enter Description");
		sc.nextLine();
		incident.setDescription(sc.nextLine());
		sc.nextLine();
		System.out.println("enter victimID");
		incident.setVictimID(sc.nextInt());
		System.out.println("enter SuspectID");
		incident.setSuspectID(sc.nextInt());
		System.out.println("enter AgencyID");
		incident.setAgencyID(sc.nextInt());
		
		
	    IncidentsDao dao=new IncidentsDaoImpl();
		try {
			Boolean Success=dao.CreateIncident(incident);
			if(Success==true) {
				System.out.println("*data inserted succesfully*");
			}
			else {
				System.out.println("*data not inserted*");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


	        
	}

}