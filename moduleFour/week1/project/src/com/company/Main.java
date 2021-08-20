package com.company;

public class Main {

    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        GenericBox<Integer> intBox = new GenericBox<>();

        stringBox.setT("Hello World");
        intBox.setT(10);

        stringBox.print();
        intBox.print();


        Integer[] intArr = {1,2,3};
        String[] strArr = {"a", "b", "c"};

        GenericMethod.printArray(intArr);
        GenericMethod.printArray(strArr);

        System.out.println(Maximum.maximum(1,2,3));
    }
}
