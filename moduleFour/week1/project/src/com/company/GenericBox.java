package com.company;

public class GenericBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }
}
