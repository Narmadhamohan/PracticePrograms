package com.generics.excercise1;

import java.util.Arrays;
import java.util.List;

public class GenericsExtendTest {

	
	
	 public void printNames(List<? extends Animal> animals) {
	        for (Animal animal : animals) {
	            System.out.println(animal.getName());
	        }
	    }
	
	public static void main(String[] args) {

		GenericsExtendTest animalstest = new GenericsExtendTest();

        List<Cat> cats = Arrays.asList(new Cat("White"), new Cat("Brown"));
        List<Creature> creatures = Arrays.asList(new Cat("White"), new Cat("Brown"));
        List<Creature> creatures1 = Arrays.asList(new Creature(true), new Creature(false));

        
        animalstest.printNames(cats);
        //Not allowed types
       // animalstest.printNames(creatures);
       // animalstest.printNames(creatures1);

		
	}

}
