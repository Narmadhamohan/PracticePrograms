package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BagFlatMap {
	String name;
	List<String> items;

	public BagFlatMap(String name, String... items) {
		this.name = name;
		this.items = Arrays.asList(items);
	}

	public List<String> getItems() {
		return items;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create named bags
		BagFlatMap bagA = new BagFlatMap("Fruits", "Apple","Banana","Chikoo");
		BagFlatMap bagB = new BagFlatMap("Veggies", "Carrot","Beetroot","Potato");
		
		List<BagFlatMap> bags =  Arrays.asList(bagA,bagB);
		System.out.println("-------- With Flatmap(function)-----------");
	List<String> items=	bags.stream()
		.map(BagFlatMap::getItems)
		.flatMap(Collection::stream)
		.collect(Collectors.toList());
    System.out.println("\t  Map results: " + items);

	
		
	}

}
