package com.abstraction;

public class Hdfcbank implements Rbibank, Worldbank {

	@Override
	public void fixed() {
		
	}

	@Override
	public void savings() {
		
	}

	@Override
	public void deposit() {
		
	}
	
	public static void main(String[] args) {
		Rbibank r = new Hdfcbank();
		r.deposit();
		r.savings();
		
		Worldbank w = new Hdfcbank();
		w.fixed();
	}

	

}
