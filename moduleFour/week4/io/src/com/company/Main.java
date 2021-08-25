package com.company;

import java.util.List;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        String fileName = userDirectory + "/src/com/company/data.txt";
	    List<Book> books = BookReader.readBooksFromFile(fileName);

	    books.forEach(book -> System.out.println(book.getTitle()));
    }
}
