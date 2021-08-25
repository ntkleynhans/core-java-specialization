package com.company;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookReader {
    public static List<Book> readBooksFromFile(String fileName) {
        List<Book> books = null;
        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
            books = stream.map(line -> {
                String[] parts = line.split(";");
                return new Book(parts[0], parts[1], Double.parseDouble(parts[2]));
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
