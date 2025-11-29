package com.bookstore.models;

public class TextBook extends Book
{
    String subject;
    int gradeLevel;
    String educationLevel;

    public TextBook(String title, String author, double mass, double volume,
                    double price, int code, String subject, int gradeLevel,
                    String educationLevel) {
        super(title, author, mass, volume, price, code);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
        this.educationLevel = educationLevel;
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
    
    boolean isForElementarySchool()
    {
        return false;
    }

    boolean isForHighSchool()
    {
        return false;
    }
}
