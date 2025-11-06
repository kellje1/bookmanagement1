package com.bookmanagement1;

public class Book {
    private String title;
    private String author;
    private String publication;
    private String genre;

    public Book(String title, String author, String publication, String genre) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String publication() {
        return publication;
    }

    public void setPublication() {
        this.publication = publication;
    }

    public String genre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }
}