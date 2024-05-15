package com.java.crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.java.crime.dao.ReportsDao;
import com.java.crime.dao.ReportsDaoImpl;

import com.java.crime.model.Reports;

public class ShowReportsById {

	public static void main(String[] args) {
		int ReportID;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ReportID");
		ReportID=sc.nextInt();
		ReportsDao dao = new ReportsDaoImpl();
		try {
			List<Reports>ReportList=dao.SearchReportsById(ReportID);
			for (Reports report : ReportList) {
				System.out.println(report);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
