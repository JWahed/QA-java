package com.day6.library;


public class Book extends Items implements Readable {

    private String name;
    private String author;
    private String publisher;
    private String isbn;
    private GenreEnum.Genre genre;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public GenreEnum.Genre getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum.Genre genre) {
        this.genre = genre;
    }


    public Book() {}

    public Book(String name, String author, String publisher, String isbn, GenreEnum.Genre genre) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book information {" +
                "Book Name: '" + name + '\'' +
                ", Author: '" + author + '\'' +
                ", Publisher: '" + publisher + '\'' +
                ", ISBN: " + isbn +
                ", Genre: " + genre +
                '}';
    }

    @Override
    public void Read(Items book, Person person) {
        System.out.printf("Book %s is currently being read by %s %s",
                           ((Book) book).getName(), person.getFirstName(), person.getLastName()
        );
    }
}
