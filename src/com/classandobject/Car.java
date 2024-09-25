package com.classandobject;

 public class Car {
	private int speed;
	private int steering;
	
	public Car() {
		
	}
	public Car(int sp) {
		speed=sp;
	}
	public Car(int sp , int str) {
		
	}
	
	public void accelarate() {
		speed+=5;
	}
	public void applyBreak() {
		speed-=20;
	}
	public void turnLeft() {
		steering +=90;
	
	}
	public void turnRight() {
		steering+=180;
		
	}
	public void printDetails() {
		System.out.println("Current Speed is = " +speed);
		System.out.println("Angle of Your Steering = " +steering);
	}
	 

}
