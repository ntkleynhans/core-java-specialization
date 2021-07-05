package com.lq.exercises;

public class Car {
	private int speed;
	private String name;
	
	public Car(String name, int speed) {
		setName(name);
		setSpeed(speed);
	}
	public Car(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(", ");
		sb.append(getSpeed());
		return sb.toString();
	}
}
