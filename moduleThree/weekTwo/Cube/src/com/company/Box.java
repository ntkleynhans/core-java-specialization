package com.company;

public class Box {
    private int height;
    private int width;
    private int length;

    public Box() {
    }

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Box)) {
            return false;
        }
        Box box = (Box) o;
        return height == box.height && width == box.width && length == box.length;
    }

    @Override
    public String toString() {
        return "{" +
            " height='" + getHeight() + "'" +
            ", width='" + getWidth() + "'" +
            ", length='" + getLength() + "'" +
            "}";
    }

    
}
