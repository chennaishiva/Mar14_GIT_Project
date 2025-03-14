package com.abstraction;

public class SouthIndians extends Indians {

	@Override
	public void breakfast() {
		System.out.println("Idly or dosa");
	}
	
	public static void main(String[] args) {
		Indians i = new SouthIndians();
		i.aadharCard();
		i.voterId();
		i.breakfast();
	}

}
