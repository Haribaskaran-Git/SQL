package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.dao.SheltersDao;
import com.java.petpals.dao.SheltersdaoImpl;
import com.java.petpals.model.Pets;
import com.java.petpals.model.Shelters;

public class ShowByShelterId {
	public static void main(String[] args) {
		int ShelterId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ShelterId");
		ShelterId=sc.nextInt();
		SheltersDao dao = new SheltersdaoImpl();
		try {
			List<Shelters>shellList=dao.SearchShelterById(ShelterId);
			for (Shelters shell : shellList) {
				System.out.println(shell);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Shelter ID ------>
	// 1 to 10

}
