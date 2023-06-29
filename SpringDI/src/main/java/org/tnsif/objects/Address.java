package org.tnsif.objects;

public class Address {

	//private members
	String city = "Mumbai";
	String area = "vasai";
	long pincode = 401201;
	
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println(city+" "+area+" "+pincode);
	}
	
}
