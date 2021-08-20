package com.company;

public class GenericMethod {

    public static <T> void printArray(T[] items) {
        for(T item : items) {
            System.out.println(item);
        }
    }
}
