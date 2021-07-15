package com.javaoo.store;

public class Main {

    public static void main(String[] args) {
	    ClassicalCD bach = new ClassicalCD();

	    bach.showPerformer();

	    bach.addPerformer("Perform 1");
        bach.addPerformer("Perform 2");
        bach.addPerformer("Perform 3");
        bach.addPerformer("Perform 4");
        bach.addPerformer("Perform 5");
        bach.addPerformer("Perform 6");

        bach.showPerformer();
    }
}
