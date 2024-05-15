package com.java.crime.junit;
//
//import static org.junit.Assert.*;
//import java.sql.SQLException;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.java.crime.dao.IncidentsDao;
//import com.java.crime.dao.IncidentsDaoImpl;
//import com.java.crime.model.Incidents;
//import com.java.crime.util.DBConnUtil;
//
//public class IncidentsDaoTest {
//    private IncidentsDao incidentsDao;
//    private Incidents testIncident;
//
//    @Before
//    public void setUp() {
//        incidentsDao = new IncidentsDaoImpl(); 
//        testIncident = new Incidents();
//      
//        testIncident.setIncidentID(4);
//        testIncident.setIncidentType("Theft");
//        testIncident.setIncidentDate(java.sql.Date.valueOf("2024-05-15"));
//        testIncident.setLatitude(40.7128);
//        testIncident.setLongitude(-74.0060);
//        testIncident.setDescription("Theft at downtown store");
//        testIncident.setStatus("Pending");
//        testIncident.setVictimID(30);
//        testIncident.setSuspectID(15);
//        testIncident.setAgencyID(45);
//    }
//
//    @Test
//    public void testCreateIncidentWithValidAttributes() throws SQLException, ClassNotFoundException {
//        // Prepare test incident data
//        Incidents testIncident = new Incidents();
//        testIncident.setIncidentID(1); // Set a unique incident ID
//        // Set other attributes accordingly
//
//        // Mock the DB connection and prepared statement
//        when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockPreparedStatement);
//        when(DBConnUtil.getConnection(any(String.class))).thenReturn(mockConnection);
//        
//        // Insert the test incident into the database
//        boolean success = incidentsDao.createIncident(testIncident);
//
//        // Verify that the method returns true indicating success
//        assertTrue(success);
//        
//        // Retrieve the inserted incident from the database
//        Incidents insertedIncident = incidentsDao.searchByIncidentId(testIncident.getIncidentID());
//
//        // Verify that the retrieved incident is not null
//        assertNotNull(insertedIncident);
//
//        // Verify that the attributes of the retrieved incident match the test incident
//        assertEquals(testIncident.getIncidentID(), insertedIncident.getIncidentID());
//        assertEquals(testIncident.getIncidentType(), insertedIncident.getIncidentType());
//        // Verify other attributes similarly
//    }
//}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class IncidentsDaoTest {
    
    private IncidentsDao incidentsDao;

    @Before
    public void setUp() {
        // Initialize the IncidentsDao
        incidentsDao = new IncidentsDaoImpl();
    }

    //@Test
//    public void testCreateIncident() throws SQLException, ClassNotFoundException {
//        // Prepare test incident data
//        Incidents testIncident = new Incidents();
//        testIncident.setIncidentID(8);
//        testIncident.setIncidentType("Robbery");
//        testIncident.setIncidentDate(java.sql.Date.valueOf("2024-05-15"));
//        testIncident.setLatitude(40.7128);
//        testIncident.setLongitude(-74.0060);
//        testIncident.setDescription("Theft at downtown store");
//        testIncident.setStatus("Pending");
//        testIncident.setVictimID(30);
//        testIncident.setSuspectID(15);
//        testIncident.setAgencyID(45);
//
//        // Insert the test incident into the database
//        boolean success = incidentsDao.CreateIncident(testIncident);
//
//        // Verify that the incident was created successfully
//        assertTrue(success);
//
//        // Retrieve the inserted incident from the database
//        Incidents insertedIncident = incidentsDao.searchByIncidentId(testIncident.getIncidentID());
//
//        // Verify that the retrieved incident is not null
//        assertNotNull(insertedIncident);
//
//        // Verify that the attributes of the retrieved incident match the test incident
//        assertEquals(testIncident.getIncidentID(), insertedIncident.getIncidentID());
//        assertEquals(testIncident.getIncidentType(), insertedIncident.getIncidentType());
//        // Verify other attributes similarly
//    }

    @Test
    public void testUpdateIncidentStatus() throws SQLException, ClassNotFoundException {
        // Prepare test incident data
        Incidents testIncident = new Incidents();
        testIncident.setIncidentID(1);
        

        
        boolean success = incidentsDao.updateIncidentStatus("bad", testIncident.getIncidentID());

       
        assertTrue(success);
    }

    
}
