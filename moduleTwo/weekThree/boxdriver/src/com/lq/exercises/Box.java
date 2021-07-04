package com.lq.exercises;

public class Box {
    private double height;
    private double length;
    private double width;

    public Box(double height, double width, double length) {
        setHeight(height >= 0.0 ? height : 1.0);
        setWidth(width >= 0.0 ? width : 1.0);
        setLength(length >= 0.0 ? length : 1.0);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height >= 0.0) {
            this.height = height;
        } else {
            System.out.println("Height must be greater than zero");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if( width >= 0.0 ) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than zero");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if( length >= 0.0 ) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than zero");
        }
    }

    public double getVolume() {
        return getHeight() * getWidth() * getLength();
    }

    public double getSurfaceArea() {
        return (getHeight()*getHeight() + getWidth()*getWidth() + getLength()*getHeight()) * 2.0;
    }

    public void printBox() {
        System.out.format("Length = %.2f%n", getLength());
        System.out.format("Width = %.2f%n", getWidth());
        System.out.format("Height = %.2f%n", getHeight());
        System.out.format("Volume = %.2f%n", getVolume());
        System.out.format("Surface Area = %.2f%n", getSurfaceArea());
    }

}
