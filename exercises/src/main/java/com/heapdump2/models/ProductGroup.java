package com.heapdump2.models;

import java.util.ArrayList;
import java.util.List;

import com.heapdump2.AbstractProduct;

public class ProductGroup {
	
	private List<AbstractProduct> products = new ArrayList<AbstractProduct>();
	
	public void add(AbstractProduct product) {
		products.add(product);
	}
}
