package com.java.crime.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class UpdateIncidentStatusMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Incidents incident = new Incidents();
            
            System.out.println("Enter IncidentID:");
            int incidentID = sc.nextInt();
            if (incidentID <= 0) {
                System.out.println("Invalid IncidentID. Please enter a positive integer.");
                return;
            }
            incident.setIncidentID(incidentID);
            
            System.out.println("Enter new status:");
            String status = sc.next();
            if (status.isEmpty()) {
                System.out.println("Status cannot be empty.");
                return;
            }
            incident.setStatus(status);
            
            IncidentsDao dao = new IncidentsDaoImpl();
            try {
                Boolean success = dao.updateIncidentStatus(incident.getStatus(), incident.getIncidentID());
                if (success) {
                    System.out.println("Incident status updated successfully.");
                } else {
                    System.out.println("Failed to update incident status. Incident not found or status unchanged.");
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("An error occurred while updating incident status: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
