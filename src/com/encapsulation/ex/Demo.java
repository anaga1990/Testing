package com.encapsulation.ex;

public class Demo {
	
	//Read and write access type
	private int maxTrainingRoomCapacity;
	private int minTrainingRoomCapacity;
	private String trainerName;
	private String courseName;
	private int roomNumber;
	
	//  note1: if want to make class encapsulation all instance variables must be private access specifier
	
	//note02: you must have setter or getter methods
	
	//set method
	public void setMaxTrainingRoomCapacity(int max) {
		this.maxTrainingRoomCapacity = max;
	}

	public int getMinTrainingRoomCapacity() {
		return minTrainingRoomCapacity;
	}

	public void setMinTrainingRoomCapacity(int minTrainingRoomCapacity) {
		this.minTrainingRoomCapacity = minTrainingRoomCapacity;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getMaxTrainingRoomCapacity() {
		return maxTrainingRoomCapacity;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.setCourseName("Testing");
		d.setMaxTrainingRoomCapacity(12);
		d.setMinTrainingRoomCapacity(1);
		d.setRoomNumber(1);
		d.setTrainerName("nagarjunaS");
		
		System.out.println(d.getCourseName());
		d.getMaxTrainingRoomCapacity();
		d.getMinTrainingRoomCapacity();
		d.getTrainerName();
		
		
		System.out.println("CourseName:  "+d.getCourseName() + " Max Room capacity: " + d.getMaxTrainingRoomCapacity() + " "+ d.getMinTrainingRoomCapacity()+ " "+ d.getTrainerName() + " "+d.getRoomNumber());
		
	}

	
	
	
	
}	
