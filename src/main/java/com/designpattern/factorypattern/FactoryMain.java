package com.designpattern.factorypattern;

import com.designpattern.factoryClass.Android;
import com.designpattern.factoryClass.IOS;
import com.designpattern.factoryClass.OS;
import com.designpattern.factoryClass.OperatingSystemFactory;
import com.designpattern.factoryClass.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		OS abj1 = osf.getInstance("open");
		abj1.specs();
		OS abj2 = osf.getInstance("close");
		abj2.specs();
		OS abj3 = osf.getInstance("other");
		abj3.specs();
		
	}

}
