package com.java.petpals.model;

import java.sql.Date;
import java.text.DecimalFormat;

public class Donations {
	private Integer DonationID;
	private String DonorName;
	private String DonationType;
	private Double DonationAmount ;
	private String DonationItem;
	private Date DonationDate ;
	public Integer getDonationID() {
		return DonationID;
	}
	public void setDonationID(Integer donationID) {
		DonationID = donationID;
	}
	public String getDonorName() {
		return DonorName;
	}
	public void setDonorName(String donorName) {
		DonorName = donorName;
	}
	public String getDonationType() {
		return DonationType;
	}
	public void setDonationType(String donationType) {
		DonationType = donationType;
	}
	public Double getDonationAmount() {
		return DonationAmount;
	}
	public void setDonationAmount(Double donationAmount) {
		DonationAmount = donationAmount;
	}
	public String getDonationItem() {
		return DonationItem;
	}
	public void setDonationItem(String donationItem) {
		DonationItem = donationItem;
	}
	public Date getDonationDate() {
		return DonationDate;
	}
	public void setDonationDate(Date donationDate) {
		DonationDate = donationDate;
	}
	@Override
	public String toString() {
		return "Donations [DonationID=" + DonationID + ", DonorName=" + DonorName + ", DonationType=" + DonationType
				+ ", DonationAmount=" + DonationAmount + ", DonationItem=" + DonationItem + ", DonationDate="
				+ DonationDate + "]";
	}
	public Donations(Integer donationID, String donorName, String donationType, Double donationAmount,
			String donationItem, Date donationDate) {
		super();
		DonationID = donationID;
		DonorName = donorName;
		DonationType = donationType;
		DonationAmount = donationAmount;
		DonationItem = donationItem;
		DonationDate = donationDate;
	}
	public Donations() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
