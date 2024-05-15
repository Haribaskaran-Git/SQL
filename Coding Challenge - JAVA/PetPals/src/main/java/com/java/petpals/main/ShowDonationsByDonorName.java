package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.petpals.dao.DonationsDao;
import com.java.petpals.dao.DonationsDaoImpl;

import com.java.petpals.model.Donations;


public class ShowDonationsByDonorName {
public static void main(String[] args) {
	String DonorName;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter DonarName");
	DonorName=sc.next();
	DonationsDao dao = new DonationsDaoImpl();
	try {
		List<Donations> DonationsList = dao.showDononName(DonorName) ;
		for (Donations donation : DonationsList) {
			System.out.println(donation);
		}
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}

//DonorNames----->
//Hari
//Allan
//Rahul
//Sneha
//Amit
//Priya
//Vikram
//Sai
//Vishnu
//Preeti



