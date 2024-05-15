package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.dao.DonationsDao;
import com.java.petpals.dao.DonationsDaoImpl;

import com.java.petpals.model.Donations;


public class ShowDonations {
	public static void main(String[] args) {
		DonationsDao dao = new DonationsDaoImpl();
		try {
			List<Donations> DonationsList = dao.showDonation() ;
			for (Donations donation : DonationsList) {
				System.out.println(donation);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
