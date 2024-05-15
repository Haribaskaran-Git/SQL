package com.java.petpals.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.petpals.model.AdoptionEvents;
import com.java.petpals.model.Donations;
import com.java.petpals.model.Pets;

public interface AdoptionEventsDao {
	List<AdoptionEvents> showAdoptionEvents() throws ClassNotFoundException, SQLException;
	Boolean CreateAdoptionEvents(AdoptionEvents adoptionevents) throws ClassNotFoundException, SQLException;

}
