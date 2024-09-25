package com.mainclassobject;

import com.classandobject.Car;

public class MainCar {
    
	
	public static void main(String[] args) {
		Car car = new Car(0);
		car.applyBreak();
//		car.accelarate();
		car.turnLeft();
//		car.turnRight();
		car.printDetails();
        
	}

}
