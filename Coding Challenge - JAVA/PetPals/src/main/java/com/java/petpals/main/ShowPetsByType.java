package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.model.Pets;

public class ShowPetsByType {
public static void main(String[] args) {
	

	String Type;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Type");
	Type=sc.next();
	PetsDao dao = new PetsdaoImpl();
	try {
		List<Pets>petsList=dao.SearchPetsByType(Type);
		for (Pets pet : petsList) {
			System.out.println(pet);
			
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//Pets Type ->>>> Cats , Dog
