package com.company;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;

public class Main {

    public static void printInstruments(Artist artist, String name) {
        System.out.println(name);
        for(String instrument : artist.getInstruments(name)) {
            System.out.println(instrument);
        }
    }

    public static void main(String[] args) {
        SortedSet<String> instruments = new TreeSet<>();
        instruments.add("Piano");
        instruments.add("Clarinet");
        instruments.add("Hurdy Gurdy");
        instruments.add("Tuba");

        Artist artist = new Artist("artist");

        artist.addMemeber("added", instruments);
        artist.addMemeber("Tom", instruments);

        SortedSet<String> instruments1 = new TreeSet<>();
        instruments.add("Guitar");
        instruments.add("Drums");
        artist.addMemeber("Steve", instruments1);

        printInstruments(artist, "added");
        printInstruments(artist, "Tom");
        printInstruments(artist, "Steve");

        System.out.println("--HERE--");
        Map<String, SortedSet<String>> instr = artist.getMemeberInstruments();
        instr.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        instr.forEach((k,v) -> {
            System.out.println(k);
            v.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        });
    }
}
