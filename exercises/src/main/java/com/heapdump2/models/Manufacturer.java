package com.heapdump2.models;

import com.heapdump2.JavaAgent;

public class Manufacturer {
	
	private String name;
	private String address;
	
	
	public Manufacturer() {
		super();
		this.name = "Dummy";
		this.address = "dummy state";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getSize() {
		return JavaAgent.getObjectSize(this) 
				+ JavaAgent.getObjectSize(name) 
				+ JavaAgent.getObjectSize(address);
	}
	

}
