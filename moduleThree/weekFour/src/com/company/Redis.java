package com.company;

public class Redis implements Driver {
    private String buffer;

    public Redis() {

    }

    @Override
    public String read(int size) {
        Integer i = new Integer(size);
        buffer = i.toString();
        return buffer;
    }

    @Override
    public int write(String data) {
        buffer = data;
        return buffer.length();
    }

    public int conversion(String data, Converter func) {
        return func.stringToInt(data);
    }
}
