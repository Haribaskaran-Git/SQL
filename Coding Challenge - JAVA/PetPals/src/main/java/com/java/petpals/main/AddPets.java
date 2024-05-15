package com.java.petpals.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.model.Pets;

public class AddPets {
public static void main(String[] args) {
	

	Pets pets = new Pets();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter PetID");
	pets.setPetID(sc.nextInt());
	System.out.println("enter Name");
	pets.setName(sc.next());
	System.out.println("enter Age");
	pets.setAge(sc.nextInt());
	System.out.println("enter Breed");
	pets.setBreed(sc.next());
	System.out.println("enter Type");
	pets.setType(sc.next());
	System.out.println("enter AvailableForAdoption");
	pets.setAvailableForAdoption(sc.nextInt());
	System.out.println("enter ShelterId");
	pets.setShelterId(sc.nextInt());
	PetsDao dao = new PetsdaoImpl();
	try {
		Boolean Success=dao.CreatePets(pets);
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
	
	// AvailableForAdoption should be 0 or 1
	// ShelterId can be from 1 to 10 because it is a FOREIGN keyword;	

}
}
