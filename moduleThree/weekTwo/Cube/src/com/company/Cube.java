package com.company;

public class Cube extends Box{
    public Cube(int dimension) {
        super(dimension, dimension, dimension);
    }

    @Override
    public void setHeight(int value) {
        this.setSide(value);
    }

    @Override
    public void setWidth(int value) {
        this.setSide(value);
    }

    @Override
    public void setLength(int value) {
        this.setSide(value);
    }

    public double getSide() {
        return super.getHeight();
    }

    public void setSide(int value) {
        if(value >= 0.0) {
            super.setHeight(value);
            super.setWidth(value);
            super.setLength(value);
        } else {
            System.out.println("You cannot set the side to values less than 0.0");
        }
    }

}
