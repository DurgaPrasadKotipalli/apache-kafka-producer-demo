package com.dp.kafka;

public class Book {
    private String name;
    private String isbn;

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }
}
