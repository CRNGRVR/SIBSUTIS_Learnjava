package com.bookstore.models;

public abstract class Book
{
    String title;
    String author;
    double mass;
    double volume;
    double price;
    int code;
    String publisher;

    public Book(String title, String author, double mass, double volume,
                double price, int code)
    {
        this.title = title;
        this.author = author;
        this.mass = mass;
        this.volume = volume;
        this.price = price;
        this.code = code;
    }

    public double calculateDensity()
    {
        return mass / volume;
    }

    String getTitle() { return this.title; }
    void setTitle(String newTitle) { this.title = newTitle; }

    String getAuthor() { return this.author; }
    void setAuthor(String newAuthor) { this.author = newAuthor; }

    double getMass() { return this.mass; }
    void setMass(double newMass) { this.mass = newMass; }

    double getVolume() { return this.volume; }
    void setVolume(double newVolume) { this.volume = newVolume; }

    double getPrice() { return this.price; }
    void setPrice(double newPrice) { this.price = newPrice; }

    int getCode() { return this.code; }
    void setCode(int newCode) { this.code = newCode; }

    public String toString()
    {
        return title + " " + author;
    }

    abstract String getCategoryDescription();
    abstract String getSpecificDetails();

    double calculateDiscount(double discountRate)
    {
        return 0;
    }
}
