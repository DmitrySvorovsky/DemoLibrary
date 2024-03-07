package com.example.demolibrary.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Nazvanie knigi ne dolgno bit pustim")
    @Size(min = 2, max = 100, message = "Nazvanie knigi dolgno bit ot 2 do 100 simvolov dlinoi")
    private String title;
    @NotEmpty(message = "Avtor ne dolgen bit pustim")
    @Size(min = 2, max = 100, message = "Imia avtora dolgno bit ot 2 do 100 simvolov dlinoi")
    private String author;
    @Min(value = 1500, message = "God dolgen bit bolshe, chem 1500")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
