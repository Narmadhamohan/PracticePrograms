package com.generics.lowerboundexercise2;

import java.util.Arrays;
import java.util.List;


public class GenericsExtendTest {

	
	 public void printNames(List<? super Animal> animals) {
	        for (Object creature : animals) {
	            System.out.println(((Creature) creature).isLand());
	        }
	    }
	
	public static void main(String[] args) {
				
GenericsExtendTest superTest = new GenericsExtendTest();

List<Cat> cats = Arrays.asList(new Cat("White"), new Cat("Brown"));
List<Animal> animals = Arrays.asList(new Animal("legs"), new Animal ("move"));
List<? super Animal> creatures = Arrays.asList(new Creature(true), new Creature(false));

//superTest.printNames(cats);
superTest.printNames(animals);
superTest.printNames(creatures);




	}

}
