package com.mila.onetoone;

public class Address {
	
	private int id;
	private String street;
	private String city;
	private String province;
	
	public Address(int id, String street, String city, String province) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	
}
