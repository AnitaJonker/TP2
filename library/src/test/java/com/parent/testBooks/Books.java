package com.parent.testBooks;

import factories.booksFactory.impl.UseBookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/02.
 */
public class Books {

    @Test
    public void testBookAuthor() throws Exception {
        UseBookFactory bookFactory = new UseBookFactory();
       Assert.assertEquals(bookFactory.getBook("Adult").getAuthor(),"Elizabeth Gilbert");
    }

}
