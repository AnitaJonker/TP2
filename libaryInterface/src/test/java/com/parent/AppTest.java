package com.parent;

import com.parent.domain.Books;
import org.junit.Assert;
import org.junit.Test;
import services.implementations.BookDetails;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    @Test
    public void testPageNumber() throws Exception
    {
        BookDetails details = new BookDetails();
        Books book = details.getBookData();
        Assert.assertEquals(book.getPageNumber(),190);
    }

    @Test
    public void testYearPublished() throws Exception
    {
        BookDetails details = new BookDetails();
        Books book = details.getBookData();
        Assert.assertEquals(book.getYearPublished(),1998);
    }
}
