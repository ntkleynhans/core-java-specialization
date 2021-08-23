package com.company;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.Map;
import java.util.TreeSet;

public class Artist {
    private SortedSet<String> memberNames;
    private Map<String, SortedSet<String>> memberInstruments;
    private String name;

    public Artist(String name) {
        memberNames = new TreeSet<>();
        memberInstruments = new HashMap<>();
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addMemeber(String name, SortedSet<String> instruments) {
        memberNames.add(name);
        memberInstruments.put(name, instruments);
    }

    public SortedSet<String> getInstruments(String name) {
        return memberInstruments.get(name);
    }

    public Map<String, SortedSet<String>> getMemeberInstruments() {
        return memberInstruments;
    }
}

