package day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date  date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("D");//date of year
		String value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("d/M/y");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd/MM/yy");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("MM YYYY");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("MMM YYYY");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("d");
		value = dateFormat.format(date);
		int i =Integer.valueOf(value);
		System.out.println(5+i);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd/MMM/YYYY");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("HH:mm:ss:S");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd/MMM/YYYY-HHmmssS");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
		System.out.println("****************************************");
		dateFormat = new SimpleDateFormat("dd/MMMM/YYYY-HHmmssS");
		value = dateFormat.format(date);
		System.out.println(value);
		System.out.println("****************************************");
	
	}
}
