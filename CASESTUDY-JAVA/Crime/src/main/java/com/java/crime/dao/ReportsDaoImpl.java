package com.java.crime.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.java.crime.model.Reports;
import com.java.crime.util.DBConnUtil;
import com.java.crime.util.DBPropertyUtil;

public class ReportsDaoImpl implements ReportsDao {
	Connection connection;
	PreparedStatement pst;


	@Override
	public List<Reports> showReportDao() throws ClassNotFoundException, SQLException {
		
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Select * from Reports";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Reports> ReportsList = new ArrayList<Reports>();
		Reports report = null;
		while(rs.next()) {
			report = new Reports();
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
		
			ReportsList.add(report);
		}
		return ReportsList;
	}


	@Override
	public List<Reports> SearchReportsById(int ReportID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Reports where ReportID = ? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, ReportID);
		ResultSet rs = pst.executeQuery();
		List<Reports> ReportsList = new ArrayList<Reports>();

		Reports report = null;
		if(rs.next()) {
			report= new Reports();
			report.setIncidentID(rs.getInt("ReportID"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
			ReportsList.add(report);
	}
	
	return ReportsList;
		
	}


	@Override
	public List<Reports> SearchReportsByReportingOfficer(int ReportingOfficer)throws ClassNotFoundException, SQLException {
		
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Reports where ReportingOfficer = ? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, ReportingOfficer);
		ResultSet rs = pst.executeQuery();
		List<Reports> ReportsList = new ArrayList<Reports>();
        Reports report = null;
		if(rs.next()) {
			report= new Reports();
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
			ReportsList.add(report);
	}
	
	return ReportsList;
		
	}


	@Override
	public List<Reports> SearchReportsByStatus(String Status) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where Status=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Status);
		ResultSet rs = pst.executeQuery();
		List<Reports> ReportsList = new ArrayList<Reports>();
		Reports report= null;
		while(rs.next()) {
			report= new Reports();
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
			ReportsList.add(report);
			
		}
		return ReportsList;
		
		
	}


	@Override
	public List<Reports> showReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException {
		
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where ReportDate=?";
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, ReportDate);
		ResultSet rs = pst.executeQuery();
		List<Reports> ReportsList = new ArrayList<Reports>();
		Reports report= null;
		while(rs.next()) {
			report= new Reports();
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setStatus(rs.getString("Status"));
			ReportsList.add(report);
			
		}
		return ReportsList;
		
		
		
		
	}
	
	
		

}
