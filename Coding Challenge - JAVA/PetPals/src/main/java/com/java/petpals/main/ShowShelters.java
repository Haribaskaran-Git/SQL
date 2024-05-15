package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;


import com.java.petpals.dao.SheltersDao;
import com.java.petpals.dao.SheltersdaoImpl;

import com.java.petpals.model.Shelters;

public class ShowShelters {
	public static void main(String[] args) {
		SheltersDao dao = new SheltersdaoImpl();
		try {
			List<Shelters> SheltersList = dao.showShelter() ;
			for (Shelters shell : SheltersList) {
				System.out.println(shell);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
