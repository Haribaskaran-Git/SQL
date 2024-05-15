package com.java.crime.main;

import java.util.List;
import java.util.Scanner;
import com.java.crime.c.myexceptions.IncidentNumberNotFoundException;
import com.java.crime.dao.IncidentsDao;
import com.java.crime.dao.IncidentsDaoImpl;
import com.java.crime.model.Incidents;

public class SearchIncidentsbyId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IncidentID:");
        int incidentID = sc.nextInt();
        sc.nextLine();

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            List<Incidents> incidentList = dao.SearchIncidentsById(incidentID);
            if (incidentList.isEmpty()) {
                throw new IncidentNumberNotFoundException("Incident not found with ID: " + incidentID);
            }
            for (Incidents incident : incidentList) {
                System.out.println(incident);
            }
        } catch (IncidentNumberNotFoundException e) {
            System.out.println("Incident number not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close(); 
        }
    }
}
