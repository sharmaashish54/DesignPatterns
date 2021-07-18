package com.designpattern.builderdesignpattern;

public class TestPhone {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setOs("Android").setBattery(3100).getPhone();
		System.out.println(p);
	}

}
