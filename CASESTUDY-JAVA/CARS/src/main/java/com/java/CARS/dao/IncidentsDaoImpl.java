package com.java.CARS.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.CARS.model.Incidents;
import com.java.CARS.util.DBConnUtil;
import com.java.CARS.util.DBPropertyUtil;
public class IncidentsDaoImpl implements IncidentsDao {
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Incidents> showIncidentDao() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Incidents";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Incidents> IncidentsList = new ArrayList<Incidents>();
		Incidents incident = null;
		while(rs.next()) {
			incident = new Incidents();
			incident.setIncidentID(rs.getInt("IncidentId"));
			incident.setIncidentType(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDescription(rs.getString("Description"));
			incident.setStatus(rs.getString("Status"));
			incident.setVictimID(rs.getInt("VictimID"));
			incident.setSuspectID(rs.getInt("SuspectID"));
			incident.setAgencyID(rs.getInt("AgencyID"));
			IncidentsList.add(incident);
		}
		return IncidentsList;
	}
	

	@Override
	public Incidents searchByIncidentId(int IncidentId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Incidents where IncidentId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, IncidentId);
		ResultSet rs = pst.executeQuery();
		Incidents incident = null;
		if(rs.next()) {
			incident = new Incidents();
			incident.setIncidentID(rs.getInt("IncidentId"));
			incident.setIncidentType(rs.getString("IncidentType"));
			incident.setIncidentDate(rs.getDate("IncidentDate"));
			incident.setLatitude(rs.getDouble("Latitude"));
			incident.setLongitude(rs.getDouble("Longitude"));
			incident.setDescription(rs.getString("Description"));
			incident.setStatus(rs.getString("Status"));
			incident.setVictimID(rs.getInt("VictimID"));
			incident.setSuspectID(rs.getInt("SuspectID"));
			incident.setAgencyID(rs.getInt("AgencyID"));
	}
	
	return incident;
	}

}
