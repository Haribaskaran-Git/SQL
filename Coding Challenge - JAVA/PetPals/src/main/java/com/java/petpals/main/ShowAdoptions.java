package com.java.petpals.main;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.dao.AdoptionEventsDao;
import com.java.petpals.dao.AdoptionEventsDaoImpl;
import com.java.petpals.model.AdoptionEvents;


public class ShowAdoptions {
	public static void main(String[] args) {
		AdoptionEventsDao dao= new AdoptionEventsDaoImpl();
		try {
			List<AdoptionEvents> AdoptionsList = dao.showAdoptionEvents() ;
			for (AdoptionEvents Adopt : AdoptionsList) {
				System.out.println(Adopt);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
