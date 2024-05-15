package com.java.petpals.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.java.petpals.dao.AdoptionEventsDao;
import com.java.petpals.dao.AdoptionEventsDaoImpl;
import com.java.petpals.model.AdoptionEvents;

public class AddAdoptions {
	public static void main(String[] args) {
		
	
	AdoptionEvents adoptionevents = new AdoptionEvents();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter EventID");
	adoptionevents.setEventID(sc.nextInt());
	System.out.println("enter EventName");
	adoptionevents.setEventName(sc.next());
	System.out.print("Enter date (yyyy-MM-dd): ");
	String DateString=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
		java.util.Date date = dateFormat.parse(DateString);
		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		 adoptionevents.setEventDate(sqlDate);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	System.out.println("enter Location");
	adoptionevents.setLocation(sc.next());
	AdoptionEventsDao dao = new  AdoptionEventsDaoImpl();
	try {
		Boolean Success=dao.CreateAdoptionEvents(adoptionevents);
		if(Success==true) {
			System.out.println("*data inserted succesfully*");
		}
		else {
			System.out.println("*data not inserted*");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}