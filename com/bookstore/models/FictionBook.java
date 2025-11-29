package com.bookstore.models;

public class FictionBook extends Book
{
    String genre;
    String targetAudience;
    boolean isBestseller;

    public FictionBook(String title, String author, double mass, double volume,
                       double price, int code, String genre, 
                       String targetAudience, boolean isBestseller) {

        super(title, author, mass, volume, price, code);
        this.genre = genre;
        this.targetAudience = targetAudience;
        this.isBestseller = isBestseller;
    }

    boolean isClassicLiterature()
    {
        return false;        
    }


    @Override
    String getCategoryDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategoryDescription'");
    }

    @Override
    String getSpecificDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpecificDetails'");
    }
}
