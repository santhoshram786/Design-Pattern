package com.phone;

public class ObjectFactory {
	
	public OS getOS(String s)
	{
		if(s.equals("open"))
			return new Andriod();
		else if(s.equals("close"))
			return new IOS();
		else
			return new Windows();
	}

}
