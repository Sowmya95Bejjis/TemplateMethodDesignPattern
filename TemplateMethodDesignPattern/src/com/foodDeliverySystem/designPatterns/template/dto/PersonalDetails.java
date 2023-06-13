package com.foodDeliverySystem.designPatterns.template.dto;

public class PersonalDetails {
	
	private String personType;
	
	private String name;
	
	private String phoneNumber;
	
	private String emailId;
	
	private Address address;

	public PersonalDetails(String personType, String name, String phoneNumber, String emailId, Address address) {
		super();
		this.personType = personType;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
