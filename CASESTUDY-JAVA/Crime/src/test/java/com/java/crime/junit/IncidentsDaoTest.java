
package com.java.crime.junit;

import static org.junit.Assert.*;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;




import static org.junit.Assert.assertEquals;;

public class IncidentsDaoTest {
    
    private IncidentsDao incidentsDao;
    private Incidents testIncident;

    @Before
    public void setUp() {
        // Initialize the IncidentsDao
        incidentsDao = new IncidentsDaoImpl();
        testIncident = new Incidents();
        testIncident.setIncidentID(28);
        testIncident.setIncidentType("Theft");
        testIncident.setIncidentDate(java.sql.Date.valueOf("2024-05-15"));
        testIncident.setLatitude(40.7128);
        testIncident.setLongitude(-74.0060);
        testIncident.setDescription("Theft at downtown store");
        testIncident.setStatus("Pending");
        testIncident.setVictimID(30);
        testIncident.setSuspectID(15);
        testIncident.setAgencyID(45);
    }
    
    @Test
    public void testCreateIncident() throws SQLException, ClassNotFoundException {
    	assertTrue(incidentsDao.CreateIncident(testIncident));
    }

    
    @Test
    public void testUpdateIncidentStatus() throws SQLException, ClassNotFoundException {
       
        Incidents testIncident = new Incidents();
        testIncident.setIncidentID(1);
        

        
        boolean success = incidentsDao.updateIncidentStatus("bad", testIncident.getIncidentID());

       
        assertTrue(success);
    }

    
}
