package com.java.petpals.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.petpals.dao.SheltersDao;
import com.java.petpals.dao.SheltersdaoImpl;

import com.java.petpals.model.Shelters;

public class AddShelters {
	public static void main(String[] args) {
		Shelters shelter = new Shelters();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ShelterID");
		shelter.setShelterID(sc.nextInt());
		System.out.println("enter Name");
		shelter.setName(sc.next());
		System.out.println("enter Location");
		shelter.setLocation(sc.next());
		SheltersDao dao = new SheltersdaoImpl();
		try {
			Boolean Success=dao.CreateShelters(shelter);
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
