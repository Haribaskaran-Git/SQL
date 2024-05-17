package com.java.crime.model;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		LawEnforcementAgencies law = new LawEnforcementAgencies(31,"Andhra Pradesh Police Department","Statewide",
				"9876543210","Andhra Pradesh");
		System.out.println(law.toString());
	}
}
