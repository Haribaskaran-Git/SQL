package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.model.Pets;

public class ShowPetsByBreed {
	public static void main(String[] args) {
		

		String Breed;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Breed");
		Breed=sc.next();
		PetsDao dao = new PetsdaoImpl();
		try {
			List<Pets>petsList=dao.SearchPetsByBreed(Breed);
			for (Pets pet : petsList) {
				System.out.println(pet);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
// Breed ----->
//Labrador Retriever
//Persian
//German Shepherd
//Siamese
//Golden Retriever
//Siamese
//German Shepherd
//Maine Coon
//Labrador Retriever
//British Shorthair
//red
