package com.day6.library;

import java.time.LocalDate;


public class Newspaper extends Items implements Readable {

    private String publisher;
    private LocalDate publishDate;
    private boolean broadsheet;


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isBroadsheet() {
        return broadsheet;
    }

    public void setBroadsheet(boolean broadsheet) {
        this.broadsheet = broadsheet;
    }


    public Newspaper() {}

    public Newspaper(String publisher, LocalDate publishDate, boolean broadsheet) {
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.broadsheet = broadsheet;
    }

    @Override
    public String toString() {
        return "Newspapers {" +
                "Publisher: '" + publisher + '\'' +
                ", Publish Date: " + publishDate +
                ", Broadsheet: " + broadsheet +
                '}';
    }

    @Override
    public void Read(Items np, Person person) {
        System.out.printf("Newspaper %s is currently being read by %s %s",
                ((Newspaper) np).getPublisher(), person.getFirstName(), person.getLastName()
        );
    }


}
