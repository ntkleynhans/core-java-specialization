package com.lq.exercises;

import com.lq.exercises.Car;
import com.lq.exercises.SportsCar;
import com.lq.exercises.StationWagon;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new StationWagon("station", 50, 5);
		Car car2 = new SportsCar("sport", 70);

		for(Car car : new Car[]{car1, car2}) {
			System.out.println(car);
			System.out.println("");
		}
	}

}
