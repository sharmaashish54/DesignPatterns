package com.designpattern.builderdesignpattern;

public class Phone {

	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	public Phone(String os, int ram, String processor, double screensize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screensize = screensize; 	
		this.battery = battery;
	}
	
	public void setOs(String os) {
		this.os = os;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}
	
}
