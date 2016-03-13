package com.parent.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/03/13.
 */
public class Books implements Serializable {


    private String bookName;
    private String author;
    private int pageNumber;
    private int yearPublished;

    public String getBookName()  {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books book = (Books) o;

        return bookName == book.bookName;

    }

    @Override
    public int hashCode() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", yearPublished=" + yearPublished +
                '}';
    }



}
