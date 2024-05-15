package com.java.petpals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.petpals.model.Pets;
import com.java.petpals.model.Shelters;
import com.java.petpals.util.DBConnUtil;
import com.java.petpals.util.DBPropertyUtil;

public class SheltersdaoImpl implements SheltersDao  {
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Shelters> showShelter() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Shelters";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Shelters> SheltersList = new ArrayList<Shelters>();
		Shelters shell = null;
		while(rs.next()) {
			shell = new Shelters();
			shell.setShelterID(rs.getInt("ShelterID"));
			shell.setName(rs.getString("Name"));
			shell.setLocation(rs.getString("Location"));
			
			SheltersList.add(shell);
		}
		return SheltersList;
	}

	@Override
	public Boolean CreateShelters(Shelters shelter) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Insert Into Shelters (ShelterID, Name, Location)values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,shelter.getShelterID());
		pst.setString(2,shelter.getName());
		pst.setString(3,shelter.getLocation());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Shelters> SearchSheltersByLocation(String Location) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Shelters where Location=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Location);
		ResultSet rs = pst.executeQuery();
		List<Shelters> SheltersList = new ArrayList<Shelters>();
		Shelters shell = null;
		while(rs.next()) {
			shell = new Shelters();
			shell.setShelterID(rs.getInt("ShelterID"));
			shell.setName(rs.getString("Name"));
			shell.setLocation(rs.getString("Location"));
			
			SheltersList.add(shell);
		}
		return SheltersList;
	}

	@Override
	public List<Shelters> SearchShelterById(int ShelterID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Shelters where ShelterID = ? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, ShelterID);
		ResultSet rs = pst.executeQuery();
		List<Shelters> SheltersList = new ArrayList<Shelters>();
		Shelters shell = null;
		while(rs.next()) {
			shell = new Shelters();
			shell.setShelterID(rs.getInt("ShelterID"));
			shell.setName(rs.getString("Name"));
			shell.setLocation(rs.getString("Location"));
			
			SheltersList.add(shell);
		}
		return SheltersList;
	}

}
