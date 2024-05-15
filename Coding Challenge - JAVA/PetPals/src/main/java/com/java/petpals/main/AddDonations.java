package com.java.petpals.main;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.java.petpals.dao.DonationsDao;
import com.java.petpals.dao.DonationsDaoImpl;
import com.java.petpals.model.Donations;

public class AddDonations {
public static void main(String[] args) {
	Donations donations = new Donations();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter DonationID");
	donations.setDonationID(sc.nextInt());
	System.out.println("enter DonorName");
	donations.setDonorName(sc.next());
	System.out.println("enter DonationType");
	donations.setDonationType(sc.next());
	System.out.println("enter DonationAmount");
	donations.setDonationAmount(sc.nextDouble());
	System.out.println("enter DonationItem");
	donations.setDonationItem(sc.next());
	System.out.print("Enter date (yyyy-MM-dd): ");
	String DateString=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
		java.util.Date date = dateFormat.parse(DateString);
		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		 donations.setDonationDate(sqlDate);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	DonationsDao dao = new DonationsDaoImpl();
	try {
		Boolean Success=dao.CreateDonations(donations);
		if(Success==true) {
			System.out.println("*data inserted succesfully*");
		}
		else {
			System.out.println("*data not inserted*");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
}
}
