package com.builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyNewPhnoe np=new MyNewPhnoe("andriod", 5, 4, "Grey");
		//System.out.println(np);
		
		//instead of passing all the parameterswhich is mandatory we will use phonebuilder class to biuld our own phone
		
		MyNewPhnoe n=new PhoneBulider().setColor("Red").getMyPhone();
		System.out.println(n);

	}

}
