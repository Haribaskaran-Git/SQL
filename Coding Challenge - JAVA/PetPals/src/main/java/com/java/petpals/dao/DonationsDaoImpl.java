package com.java.petpals.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.petpals.model.Donations;
import com.java.petpals.model.Pets;
import com.java.petpals.model.Shelters;
import com.java.petpals.util.DBConnUtil;
import com.java.petpals.util.DBPropertyUtil;

public class DonationsDaoImpl implements DonationsDao {
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Donations> showDonation() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Donations";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonorName(rs.getString("DonorName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDate(rs.getDate("DonationDate"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	
	}

	@Override
	public List<Donations> showDononName(String DononName) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Donations where DonorName =?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, DononName);
		ResultSet rs = pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonorName(rs.getString("DonorName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDate(rs.getDate("DonationDate"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	}

	@Override
	public Boolean CreateDonations(Donations donations) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Insert Into Donations (DonationID, DonorName, DonationType, DonationAmount, DonationItem, DonationDate)Values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,donations.getDonationID());
		pst.setString(2,donations.getDonorName());
		pst.setString(3,donations.getDonationType());
		pst.setDouble(4,donations.getDonationAmount());
		pst.setString(5,donations.getDonationItem());
		pst.setDate(6,donations.getDonationDate());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Donations> getDonationsDateRange(Date startDate, Date endDate)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd ="select * from Donations where DonationDate between ? and ? ";
		
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, startDate);
		pst.setDate(2, endDate);
		
		ResultSet rs=pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonorName(rs.getString("DonorName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDate(rs.getDate("DonationDate"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	}

	@Override
	public Boolean updateDonationsItem(String DonationItem, int DonationId)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String  cmd="update Donations set DonationItem=? where DonationId=? ";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, DonationItem);
		pst.setInt(2, DonationId);
		
	
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}


	}

}
