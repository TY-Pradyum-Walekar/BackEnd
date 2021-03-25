package com.tyss.abbstract.defaul;

public abstract class Walmart {
	
	abstract void purchase();
	
	void cancelPurchase() {
		System.out.println("Purchased item has been cancelled");
	}

}
