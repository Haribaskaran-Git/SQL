package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Incidents;
import com.java.crime.model.Reports;

public class ShowReportsbyStatus {

	public static void main(String[] args) {
		String Status;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Status");
		Status=sc.next();
		ReportsDao dao = new ReportsDaoImpl();
		try {
			List<Reports>ReportsList=dao.SearchReportsByStatus(Status);
			for (Reports report : ReportsList) {
				System.out.println(report);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//status are draft,finalized