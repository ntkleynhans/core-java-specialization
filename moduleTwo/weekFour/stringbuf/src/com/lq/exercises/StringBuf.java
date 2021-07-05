package com.lq.exercises;

public class StringBuf {

    public static void main(String[] args) {
        StringDetail sd = new StringDetail("Starting text ...");

        System.out.println(sd.getBuilder());
        sd.addText(" some more text ...");
        System.out.println(sd.getBuilder());
    }
}
