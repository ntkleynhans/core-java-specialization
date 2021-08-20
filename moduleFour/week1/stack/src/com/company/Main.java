package com.company;

public class Main {

    public static void main(String[] args) {
        StackArray<Integer> ints = new StackArray<>();

	    ints.push(1);
	    ints.push(2);

	    System.out.println(ints.pop());
        System.out.println(ints.pop());
    }
}
