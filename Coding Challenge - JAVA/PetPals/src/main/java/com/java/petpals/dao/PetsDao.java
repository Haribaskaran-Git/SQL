package com.java.petpals.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.model.Pets;

public interface PetsDao {
	List<Pets> showpet() throws ClassNotFoundException, SQLException;
	List<Pets> SearchPetsById(int PetID) throws ClassNotFoundException, SQLException;
	List<Pets> SearchPetsByType(String Type) throws ClassNotFoundException, SQLException;
	List<Pets> SearchPetsByBreed(String Breed) throws ClassNotFoundException, SQLException;
	Boolean CreatePets(Pets pets) throws ClassNotFoundException, SQLException;




}
