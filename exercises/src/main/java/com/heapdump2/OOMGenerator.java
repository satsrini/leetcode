package com.heapdump2;

public class OOMGenerator {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory()/(1024*1024));

                System.out.println("FREE MEM AT START "+ Runtime.getRuntime().freeMemory()/(1024*1024));
		try {
			ProductManager productManager = new ProductManager();
			productManager.populateProducts();
			
		} catch (OutOfMemoryError outofMemory) {
			System.out.println("Catching out of memory error "+ Runtime.getRuntime().freeMemory()/(1024*1024));
			// Log the information,so that we can generate the statistics (latter on).
			throw outofMemory;
		}
	}
}
