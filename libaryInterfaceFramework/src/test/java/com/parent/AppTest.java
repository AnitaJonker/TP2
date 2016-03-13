package com.parent;

import com.parent.domain.Books;
import configure.LibaryConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;
import services.BookServices;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private BookServices services;

    @BeforeMethod
    public void setup() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LibaryConfig.class);
        services = (BookServices)ctx.getBean("book");
    }

    @Test
    public void testPageNumber() throws Exception
    {
        Books book = services.getBookData();
        Assert.assertEquals(book.getPageNumber(),190);
    }

    @Test
    public void testYearPublished() throws Exception
    {
        Books book = services.getBookData();
        Assert.assertEquals(book.getYearPublished(),1998);
    }
}
