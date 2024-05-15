package com.java.crime.model;

import java.sql.Date;

public class Suspects {


		private Integer SuspectID ;
		private String FirstName;
		private String LastName;
		private Date DateOfBirth;
		private Gender gender;
		private String PhoneNumber ;
		private String Address ;
		public Integer getSuspectID() {
			return SuspectID;
		}
		public void setSuspectID(Integer suspectID) {
			SuspectID = suspectID;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public Date getDateOfBirth() {
			return DateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "Suspects [SuspectID=" + SuspectID + ", FirstName=" + FirstName + ", LastName=" + LastName
					+ ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", PhoneNumber=" + PhoneNumber + ", Address="
					+ Address + "]";
		}
		public Suspects() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Suspects(Integer suspectID, String firstName, String lastName, Date dateOfBirth, Gender gender,
				String phoneNumber, String address) {
			super();
			SuspectID = suspectID;
			FirstName = firstName;
			LastName = lastName;
			DateOfBirth = dateOfBirth;
			this.gender = gender;
			PhoneNumber = phoneNumber;
			Address = address;
		}
		
	}



