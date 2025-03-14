package com.cts;

public class Datatypes {
	
	public void sample() {
		
		//dataType variableName = variableName;

		//Whole numbers
		byte age = 127;
		short price = 32767;
		int appNo = 2147483647;
		long phno = 8220883310l;
		
		//Decimal
		float avg = 857.987774f;
		double newAvg = 853.9876543;
		
		//Characters
		char gender = 'm';
		String name = "ram";
		
		//Conditional
		boolean status = false;
		
		
		System.out.println(age);
		System.out.println(price);
		System.out.println(appNo);
		System.out.println(phno);
		System.out.println(avg);
		System.out.println(newAvg);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(status);
		
		System.out.println("My name is :" + name);
		System.out.println(age + 100);
		
	}
	
	public static void main(String[] args) {
		Datatypes d = new Datatypes();
		d.sample();
	}

}
