package com.inheritance;

public class Student {
	String whichClassNow;
	int age;
	static final String schoolname = "xyz_school";
	StudentAddress address;
	public Student(String whichClassNow, int age, StudentAddress address) {
		super();
		this.whichClassNow = whichClassNow;
		this.age = age;
		this.address = address;
	}
	//HAS-A  
	
	@Override
	public String toString() {
		return "Student [whichClassNow=" + whichClassNow + ", age=" + age + ", schoolname=" + schoolname + ", address="
				+ address + "]";
	}


	public void displayDetails() {
		System.out.println(whichClassNow + "  "+ age + " "+schoolname +" "+address.flatNumber+
				" "+address.houseNumber + " "+address.street +" "+address.city +" "+address.zipCode + " "+ address.state + " "
				+address.country);
	}
//public StudentAddress(String flatNumber, String houseNumber, String street, String state, String city,String country, String zipCode) {

	public static void main(String[] args) {
		StudentAddress sd = new StudentAddress("201", "#22", "x-road", "KA", "Bng", "india", "560036");
		Student ss = new Student("2ndStandrd", 8, sd);
		
		ss.displayDetails();
		sd = new StudentAddress("10i12921", "#223", "x-wdf", "aweewewwe", "weewrrer", "ccccc", "123456sdfgjhgfd");
		ss.displayDetails();
	}
	
	
}
