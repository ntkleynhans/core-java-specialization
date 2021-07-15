package com.javaoo.store.drivers;

import java.util.Date;

import com.javaoo.store.Item;
import com.javaoo.store.Book;
import com.javaoo.store.Artist;
import com.javaoo.store.CD;

public class InventoryDriver {

    public static void main(String[] args) {
        Item[] myInventory = new Item[50];

        myInventory[0] = new Book("Godzilla", 24.95, 5, "Author", "Randsom House", "FICTION");
        myInventory[1] = new Book("Loch", 34.95, 1, "Author Fred", "Penguin Press", "FICTION");


        myInventory[5] = new CD("Going For The One", 12.95, 4, new Artist("YES"), new Date("07/07/1977"));
        myInventory[6] = new CD("Going Down The Country", 12.95, 10, new Artist("Bozos"), new Date("09/07/1987"));
        myInventory[7] = new CD("Polka Favorites", 2.95, 4, new Artist("Jimmy and the Yuppers"), new Date("07/07/1955"));
    }
}
