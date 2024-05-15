package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;

import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;
import com.java.crime.model.Reports;


public class ShowReports {

public static void main(String[] args) {
		
		ReportsDao dao = new ReportsDaoImpl();
	try {
		List<Reports> reportsList = dao.showReportDao() ;
		for (Reports reports : reportsList) {
			System.out.println(reports);
		}
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
