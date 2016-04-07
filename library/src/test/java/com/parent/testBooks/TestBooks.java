package com.parent.testBooks;


import bookSystem.Books;
import factories.booksFactory.impl.UseBookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/02.
 */
public class TestBooks {

    @Test
    public void testBookAuthor() throws Exception {
        UseBookFactory bookFactory = new UseBookFactory();
       Assert.assertEquals(bookFactory.getBook("Adult").getAuthor(),"Elizabeth Gilbert");
    }


    @Test
    public void testSetBookAuthor() throws Exception {

        Books book = new Books.Builder()
                .author("Stephen King")
                .build();

        Assert.assertEquals(book.getAuthor(),"Stephen King");

    }
}
