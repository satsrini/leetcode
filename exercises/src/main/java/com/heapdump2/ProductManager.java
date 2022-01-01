package com.heapdump2;


import com.heapdump2.models.BrandedProduct;
import com.heapdump2.models.ElectronicGood;
import com.heapdump2.models.GroceryProduct;
import com.heapdump2.models.LuxuryGood;
import com.heapdump2.models.ProductGroup;

public class ProductManager {
	private ProductGroup regularItems = new ProductGroup();

	private ProductGroup discountedItems = new ProductGroup();

	public void populateProducts() {

		int dummyArraySize = 1;
		for (int loop = 0; loop < 10; loop++) {
			if(loop%2 == 0) {
			  createObjects(regularItems, dummyArraySize);
			}else {
			  createObjects(discountedItems, dummyArraySize);
			}
			System.out.println("Memory Consumed till now: " + loop + "::"+ regularItems + " "+discountedItems );
			dummyArraySize *= dummyArraySize * 2;
		}
	}

	private void createObjects(ProductGroup productGroup, int dummyArraySize) {
		for (int i = 0; i < dummyArraySize; ) {
			productGroup.add(createProduct());
		}
 	}
	
	private AbstractProduct createProduct() {
        int randomIndex = (int) Math.round(Math.random() * 10);
        switch (randomIndex) {
		case 0:
			return  new ElectronicGood();
		case 1:
			return	new BrandedProduct();
		case 2:
			return new GroceryProduct();
		case 3:
			return new LuxuryGood();
		default:
			return	new BrandedProduct();
		}
		
	}

}
