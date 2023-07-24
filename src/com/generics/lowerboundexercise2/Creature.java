package com.generics.lowerboundexercise2;

public class Creature {

	boolean land= false;
	
	public Creature() {
		
	}
	public Creature(boolean land) {
		this.land = land;
	}
	public boolean isLand() {
		return land;
	}
	public void setLand(boolean land) {
		this.land = land;
	} 

}
