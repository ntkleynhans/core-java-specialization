package com.javaoo.store;

public class Book extends Item {
    private String name;
    private String publisher;
    private String category;

    public Book(String title, double price, int quantity, String name, String publisher, String category) {
        super(title, price, quantity);
        this.setCategory(category);
        this.setPublisher(publisher);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
