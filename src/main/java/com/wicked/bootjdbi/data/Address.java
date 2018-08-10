package com.wicked.bootjdbi.data;

public class Address {

	private String address1;
	private String city;
	private String postaCode;

	public Address(String address1, String city, String postalCode) {
		this.setAddress1(address1);
		this.setCity(city);
		this.setPostaCode(postalCode);
	}

	public Address() {
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(String postaCode) {
		this.postaCode = postaCode;
	}

}
