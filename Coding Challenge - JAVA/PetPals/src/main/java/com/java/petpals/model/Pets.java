package com.java.petpals.model;

public class Pets {
	private Integer PetID ;
	private String Name;
	private Integer Age ;
	private String Breed ;
	private String Type;
	private Integer AvailableForAdoption ;
	private Integer ShelterId;
	public Integer getPetID() {
		return PetID;
	}
	public void setPetID(Integer petID) {
		PetID = petID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Integer getAvailableForAdoption() {
		return AvailableForAdoption;
	}
	public void setAvailableForAdoption(Integer availableForAdoption) {
		AvailableForAdoption = availableForAdoption;
	}
	public Integer getShelterId() {
		return ShelterId;
	}
	public void setShelterId(Integer shelterId) {
		ShelterId = shelterId;
	}
	
	@Override
	public String toString() {
		return "Pets [PetID=" + PetID + ", Name=" + Name + ", Age=" + Age + ", Breed=" + Breed + ", Type=" + Type
				+ ", AvailableForAdoption=" + AvailableForAdoption + ", ShelterId=" + ShelterId + "]";
	}
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pets(Integer petID, String name, Integer age, String breed, String type, Integer availableForAdoption,
			Integer shelterId) {
		super();
		PetID = petID;
		Name = name;
		Age = age;
		Breed = breed;
		Type = type;
		AvailableForAdoption = availableForAdoption;
		ShelterId = shelterId;
	}
	
	

}
