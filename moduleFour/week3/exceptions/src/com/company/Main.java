package com.company;

public class Main {

    public static void main(String[] args) {
	    Coffee coffee = null;

	    try {
	        coffee = new Coffee(125);
        } catch (TooHotException e) {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
        } finally {
			System.out.format("Coffee is set to %d%n", (coffee!=null ? coffee.getTemperature() : 0 ));
		}
    }
}
