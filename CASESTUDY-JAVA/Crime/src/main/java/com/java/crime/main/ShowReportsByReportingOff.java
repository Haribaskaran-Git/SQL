package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;

public class ShowReportsByReportingOff {
	public static void main(String[] args) {
		int ReportingOfficer;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ReportingOfficer");
		ReportingOfficer=sc.nextInt();
		ReportsDao dao = new ReportsDaoImpl();
		try {
			List<Reports>incidentList=dao.SearchReportsByReportingOfficer(ReportingOfficer);
			for (Reports report : incidentList) {
				System.out.println(report);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
