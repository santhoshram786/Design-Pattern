package com.builder;

public class PhoneBulider {
	String os;
	int size;
	int ram;
	String color;
	public PhoneBulider setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBulider setSize(int size) {
		this.size = size;
		return this;
	}
	public PhoneBulider setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBulider setColor(String color) {
		this.color = color;
		return this;
	}
	
	public MyNewPhnoe getMyPhone()
	{
		return new MyNewPhnoe(os, size, ram, color);
	}
}
