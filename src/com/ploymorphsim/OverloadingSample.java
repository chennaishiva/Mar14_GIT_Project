package com.ploymorphsim;

public class OverloadingSample {

	// Arguments depends on order

	public void empInfo(String name, String email) {
		System.out.println(name +'\t'+ email);
	}

	public void empInfo(String city, int pincode) {
		System.out.println(city +'\t'+ pincode);
	}

	// Arguments depends on dataType count or number
	public void empInfo(String state, String country, int id) {
		System.out.println(state +'\n'+ country +'\t'+ id);
	}

	public static void main(String[] args) {
		OverloadingSample o = new OverloadingSample();
		o.empInfo("ram", "ram@gmail.com");
		o.empInfo("chennai", 600040);
		o.empInfo("tamilnadu", "India", 222);

	}
}
