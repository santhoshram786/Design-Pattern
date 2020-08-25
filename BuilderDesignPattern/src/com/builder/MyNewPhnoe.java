package com.builder;

public class MyNewPhnoe {
	
	String os;
	int size;
	int ram;
	String color;
	public MyNewPhnoe(String os, int size, int ram, String color) {
		super();
		this.os = os;
		this.size = size;
		this.ram = ram;
		this.color = color;
	}
	@Override
	public String toString() {
		return "MyNewPhnoe [os=" + os + ", size=" + size + ", ram=" + ram + ", color=" + color + "]";
	}
	
	

}
