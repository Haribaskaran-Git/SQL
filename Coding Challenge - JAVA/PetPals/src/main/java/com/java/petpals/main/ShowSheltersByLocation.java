package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.java.petpals.dao.SheltersDao;
import com.java.petpals.dao.SheltersdaoImpl;

import com.java.petpals.model.Shelters;

public class ShowSheltersByLocation {
	public static void main(String[] args) {
		

		String Location;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Location");
		Location=sc.next();
		SheltersDao dao = new SheltersdaoImpl();
		try {
			List<Shelters>shellList=dao.SearchSheltersByLocation(Location);
			for (Shelters shell : shellList) {
				System.out.println(shell);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//Locations are -------------->
//	Delhi
//	Mumbai
//	Bangalore
//	Jaipur
//	Chennai
//	Hyderabad
//	Pune
//	Chennai
//	Jaipur
//	Hyderabad



