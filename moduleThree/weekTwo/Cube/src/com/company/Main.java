package com.company;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1,3,5);
        Cube cube = new Cube(3);

        System.out.println(box);
        System.out.println(cube);

        cube.setLength(5);
        System.out.println(cube);
    }
}
