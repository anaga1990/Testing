package com.encapsulation.ex;

public class TestingOFDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setCourseName("Testing");
		d.setMaxTrainingRoomCapacity(12);
		d.setMinTrainingRoomCapacity(1);
		d.setRoomNumber(2);
		d.setTrainerName("nagarjuna Annabathina");
		
		System.out.println("CourseName:  "+d.getCourseName() + " Max Room capacity: " + d.getMaxTrainingRoomCapacity() + " "+ d.getMinTrainingRoomCapacity()+ " "+ d.getTrainerName() + " "+d.getRoomNumber());
		
	}
}
