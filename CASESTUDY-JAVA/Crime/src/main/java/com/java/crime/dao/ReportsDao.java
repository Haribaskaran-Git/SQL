package com.java.crime.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.crime.model.Incidents;
import com.java.crime.model.Reports;

public interface ReportsDao {
	List<Reports> showReportDao() throws ClassNotFoundException, SQLException;
	List<Reports> SearchReportsById(int ReportID) throws ClassNotFoundException, SQLException;
	List<Reports> SearchReportsByReportingOfficer(int ReportingOfficer) throws ClassNotFoundException, SQLException;
	List<Reports> SearchReportsByStatus(String Status) throws ClassNotFoundException, SQLException;
	List<Reports> showReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException;

}
