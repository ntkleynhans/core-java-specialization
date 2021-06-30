package com.lq.exercises;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        return getHeight() * getWidth() * getLength();
    }

    public double getSurfaceArea() {
        return 2.0 * (getHeight()*getWidth() + getHeight()*getLength() + getWidth()*getLength());
    }

    public void printBox() {
        if(getLength() > 0 && getHeight() > 0  && getWidth() > 0) {
            System.out.format("Length = %.2f%n", getLength());
            System.out.format("Width = %.2f%n", getWidth());
            System.out.format("Height = %.2f%n", getHeight());
            System.out.format("Volume = %.2f%n", getVolume());
            System.out.format("Surface Area = %.2f%n", getSurfaceArea());
        }
    }

    public static void main(String[] args) {
	    Box shape = new Box(2.0, 3.0, 4.0);
	    Box cube = new Box(3.0);

	    shape.printBox();
	    cube.printBox();
    }
}
