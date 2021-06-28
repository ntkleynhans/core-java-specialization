package com.lq.exercises;

public class Car {
    private String name;
    private int speed;
    private boolean running;
    private float gasoline;

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

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public float getGasoline() {
        return gasoline;
    }

    public void setGasoline(float gasoline) {
        this.gasoline = gasoline;
    }

    public static void main(String[] args) {
	    Car carLandRover = new Car();

	    carLandRover.setName("LandRover");
	    carLandRover.setGasoline(0.85f);
	    carLandRover.setSpeed(50);
	    carLandRover.setRunning(true);


	    Car carToyota = new Car();
	    carToyota.setName("Toyota");
	    carToyota.setGasoline(0.45f);
	    carToyota.setSpeed(0);
	    carToyota.setRunning(false);

	    for(Car car: new Car[]{carLandRover, carToyota}) {
	        System.out.format("name: %s, gasoline: %.2f, speed: %d, isRunning?: %b%n",
                    car.getName(), car.getGasoline(), car.getSpeed(),car.isRunning());
        }
    }
}
