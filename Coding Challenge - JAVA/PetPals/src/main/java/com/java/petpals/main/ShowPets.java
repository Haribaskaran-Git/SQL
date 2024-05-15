package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.dao.PetsDao;
import com.java.petpals.dao.PetsdaoImpl;
import com.java.petpals.model.Pets;

public class ShowPets {
	public static void main(String[] args) {
		PetsDao dao = new PetsdaoImpl();
		try {
			List<Pets> petsList = dao.showpet() ;
			for (Pets pet1 : petsList) {
				System.out.println(pet1);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
