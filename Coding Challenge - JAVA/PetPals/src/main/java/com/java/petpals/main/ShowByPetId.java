package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.model.Pets;

public class ShowByPetId {

	public static void main(String[] args) {
		int PetID;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PetID");
		PetID=sc.nextInt();
		PetsDao dao = new PetsdaoImpl();
		try {
			List<Pets>petList=dao.SearchPetsById(PetID);
			for (Pets pet : petList) {
				System.out.println(pet);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//PetId-----> from 1 to 10
}
