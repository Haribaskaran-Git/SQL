package com.java.petpals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.petpals.model.Pets;
import com.java.petpals.util.DBConnUtil;
import com.java.petpals.util.DBPropertyUtil;

public class PetsdaoImpl implements PetsDao{
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Pets> showpet() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Pets";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Pets> petsList = new ArrayList<Pets>();
		Pets pet = null;
		while(rs.next()) {
			pet = new Pets();
			pet.setPetID(rs.getInt("PetID"));
			pet.setName(rs.getString("Name"));
			pet.setAge(rs.getInt("Age"));
			pet.setBreed(rs.getString("Breed"));
			pet.setType(rs.getString("Type"));
			pet.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pet.setShelterId(rs.getInt("ShelterId"));
			petsList.add(pet);
		}
		return petsList;
	}

	@Override
	public List<Pets> SearchPetsById(int PetID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Pets where PetID = ? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, PetID);
		ResultSet rs = pst.executeQuery();
		List<Pets> PetsList = new ArrayList<Pets>();

		Pets pet = null;
		while(rs.next()) {

			pet = new Pets();
			pet.setPetID(rs.getInt("PetID"));
			pet.setName(rs.getString("Name"));
			pet.setAge(rs.getInt("Age"));
			pet.setBreed(rs.getString("Breed"));
			pet.setType(rs.getString("Type"));
			pet.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pet.setShelterId(rs.getInt("ShelterId"));
			PetsList.add(pet);

	}
	
	return PetsList;
	}

	@Override
	public List<Pets> SearchPetsByType(String Type) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Pets where Type=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Type);
		ResultSet rs = pst.executeQuery();
		List<Pets> PetsList = new ArrayList<Pets>();
		Pets pet = null;
		while(rs.next()) {

			pet = new Pets();
			pet.setPetID(rs.getInt("PetID"));
			pet.setName(rs.getString("Name"));
			pet.setAge(rs.getInt("Age"));
			pet.setBreed(rs.getString("Breed"));
			pet.setType(rs.getString("Type"));
			pet.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pet.setShelterId(rs.getInt("ShelterId"));
			PetsList.add(pet);

	}
	
	return PetsList;
	}

	@Override
	public List<Pets> SearchPetsByBreed(String Breed) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Pets where Breed=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Breed);
		ResultSet rs = pst.executeQuery();
		List<Pets> PetsList = new ArrayList<Pets>();
		Pets pet = null;
		while(rs.next()) {

			pet = new Pets();
			pet.setPetID(rs.getInt("PetID"));
			pet.setName(rs.getString("Name"));
			pet.setAge(rs.getInt("Age"));
			pet.setBreed(rs.getString("Breed"));
			pet.setType(rs.getString("Type"));
			pet.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pet.setShelterId(rs.getInt("ShelterId"));
			PetsList.add(pet);

	}
	
	return PetsList;
	}

	@Override
	public Boolean CreatePets(Pets pets) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Insert Into Pets (PetID, Name, Age, Breed, Type, AvailableForAdoption,ShelterID)values(?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,pets.getPetID());
		pst.setString(2,pets.getName());
		pst.setInt(3,pets.getAge());
		pst.setString(4,pets.getBreed());
		pst.setString(5,pets.getType());
		pst.setInt(6,pets.getAvailableForAdoption());
		pst.setInt(7,pets.getShelterId());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}

	

}
