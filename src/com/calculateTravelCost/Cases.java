package com.calculateTravelCost;

import java.util.Arrays;

public class Cases {

	int noOfPersons;
	Integer price[];
	
	@Override
	public String toString() {
		return "Cases [noOfPersons=" + noOfPersons + ", price=" + Arrays.toString(price) + "]";
	}

	public Cases(int noOfPersons, Integer[] price) {
		super();
		this.noOfPersons = noOfPersons;
		this.price = price;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public Integer[] getPrice() {
		return price;
	}

	public void setPrice(Integer[] price) {
		this.price = price;
	}
	
	
	
}
