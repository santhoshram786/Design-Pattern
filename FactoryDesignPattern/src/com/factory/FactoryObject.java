package com.factory;

import com.phone.OS;
import com.phone.ObjectFactory;

public class FactoryObject {

	public static void main(String[] args) {

		ObjectFactory of=new ObjectFactory();
		//Here the objects are provided by Objectfactory class
		// without changing the objects each time just pass the string and get the object from factory class
		OS o=of.getOS("close");
		o.spec();
	}

}
