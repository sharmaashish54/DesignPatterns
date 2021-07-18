package com.designpattern.factoryClass;

public class OperatingSystemFactory {

	
	public OS getInstance(String os) {
		
		if(os.equals("open")) {
			return new Android();
		}else if(os.equals("close")) {
			return new IOS();
		}else if(os.equals("other")){
			return new Windows();
		}
		return null;
		
	}
}
