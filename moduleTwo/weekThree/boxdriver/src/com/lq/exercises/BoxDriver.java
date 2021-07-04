package com.lq.exercises;

import com.lq.exercises.Box;

public class BoxDriver {

    public static void main(String[] args) {
        Box box1 = new Box(7.0, 6.0, 5.0);
        Box box2 = new Box(10.0);

        box1.printBox();
        box2.printBox();


        box1.setLength(3.0);
        box1.setWidth(4.0);
        box1.setHeight(5.0);
        box1.printBox();

        box1.setLength(-5.0);

        Box box3 = new Box(-5.0, -6.0, -7.0);
        box3.printBox();
    }

}
