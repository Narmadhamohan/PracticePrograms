package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {
	String name;
	List<String> items;

	public Bag(String name, String... items) {
		this.name = name;
		this.items = Arrays.asList(items);
	}

	public List<String> getItems() {
		return items;
	}

	public static void main(String[] args) {

		// Fill the named bags wth elements
		Bag bagA = new Bag("Fruits", "Apples","Oranges","Grapes");
		Bag bagB = new Bag("Veggies", "Carrot","Radish","Potato");
		
		List<Bag> bags = Arrays.asList(bagA,bagB);
		System.out.println("-------- With map(function)-----------");
		//List<Bag> bags = null;
		List<List<String>> bagList =	bags.stream()
				.map(Bag::getItems)
				.collect(Collectors.toList());
	    System.out.println("\t  Map results: " + bagList);

	}

}
