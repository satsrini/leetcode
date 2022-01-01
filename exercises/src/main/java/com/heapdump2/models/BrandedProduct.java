package com.heapdump2.models;


import java.util.ArrayList;
import java.util.List;

import com.heapdump2.AbstractProduct;
import com.heapdump2.JavaAgent;

public class BrandedProduct extends AbstractProduct{
	private String brandName;
	private Price mrp;
	
	

	public BrandedProduct() {
		super();
		mrp = new Price();

	}

	public Price getMrp() {
		return mrp;
	}

	public void setMrp(Price mrp) {
		this.mrp = mrp;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public long getSize() {
		return JavaAgent.getObjectSize(this) + JavaAgent.getObjectSize(brandName);
	}
    
}
