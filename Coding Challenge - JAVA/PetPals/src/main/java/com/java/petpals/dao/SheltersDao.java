package com.java.petpals.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.model.Pets;
import com.java.petpals.model.Shelters;

public interface SheltersDao {

	List<Shelters> showShelter() throws ClassNotFoundException, SQLException;
	Boolean CreateShelters(Shelters shelter) throws ClassNotFoundException, SQLException;
	List<Shelters> SearchSheltersByLocation(String Location) throws ClassNotFoundException, SQLException;
	List<Shelters> SearchShelterById(int ShelterID) throws ClassNotFoundException, SQLException;

	

}
