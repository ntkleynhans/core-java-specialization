package com.company;

public enum State {
    CO("Colorado", "Denver"),
    CA("California", "Sacramento"),
    NV("Nevada", "Carson City");

    private String state;
    private String city;

    private State(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
