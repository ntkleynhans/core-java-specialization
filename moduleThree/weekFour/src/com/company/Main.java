package com.company;

public class Main {

    public static void main(String[] args) {
	    Redis redis = new Redis();
        Driver[] drivers = {redis};
	    for(Driver driver : drivers) {
            System.out.println(driver.read(10));
            System.out.println(driver.write("hello world"));
        }


	    int counter = redis.conversion("Hello", (s) -> s.length());
	    System.out.println(counter);
    }
}
