package com.oops.ex;

public class DemoOFCon {
	int courseId; // instance Variable
	String coursesName; // instance Variable

	DemoOFCon(int courseId, String coursesName) {  // its parameters constructor
		this.courseId = courseId;
		this.coursesName = coursesName;
	}
	
	DemoOFCon(DemoOFCon cc) {  // its parameters constructor
		this.courseId = cc.courseId;
		this.coursesName = cc.coursesName;
	}

	void detailsToPrint() {
		System.out.println("courseId is : " + courseId + " & coursesName : " + coursesName);
	}

	public static void main(String[] args) {
		DemoOFCon demoOFCon = new DemoOFCon(112, "java");
		demoOFCon.detailsToPrint();
		DemoOFCon demoOFCon1 = new DemoOFCon(demoOFCon);
		demoOFCon1.detailsToPrint();
	}
}
