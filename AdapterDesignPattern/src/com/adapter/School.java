package com.adapter;

public class School {

	public static void main(String[] args) {
	
		Assignment a=new Assignment();
		Pen p=new PenAdapter();
		a.setP(p);
		a.writeAssignment("Write this assignment");

	}

}
