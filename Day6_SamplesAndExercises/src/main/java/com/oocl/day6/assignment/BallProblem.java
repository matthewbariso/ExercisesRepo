package com.oocl.day6.assignment;

import java.util.ArrayList;
import java.util.Random;

public class BallProblem {
	
	public static void main(String[] args) {
		ArrayList <ball> initballs = new ArrayList <ball>();	
		
		for(int i = 0; i < 6; i++) {
			initballs.add(new ball(i,1,true,""));
		}
		
		Random rand = new Random();
		int ran1 = rand.nextInt(12);
		System.out.println(ran1);
	}
	
	
}

class ball{
	int name;
	int weight;
	boolean isOdd;
	String direc;
	public ball(int name, int weight, boolean isOdd, String direc) {
		super();
		this.name = name;
		this.weight = weight;
		this.isOdd = isOdd;
		this.direc = direc;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isOdd() {
		return isOdd;
	}
	public void setOdd(boolean isOdd) {
		this.isOdd = isOdd;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	
	
}
