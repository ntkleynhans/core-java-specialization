package com.lq.exercises;

import com.lq.exercises.Car;

public class Cargo extends Car {
	private int cargoWeight;

	public Cargo(String name, int speed, int weight) {
		super(name);
		setCargoWeight(weight);
		this.setSpeed(speed - weight);
	}
	
	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(", ");
		sb.append(getSpeed());
		sb.append(", ");
		sb.append(getCargoWeight());
		return sb.toString();
	}

}
