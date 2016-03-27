package parent.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.services.BookGenre;
import parent.com.services.impl.Comedy;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    @Test
    public void testGenrePages()
    {
        BookGenre comedy = new Comedy();
        Assert.assertEquals(comedy.getBook().getPages(),250);
    }

    @Test
    public void testName()
    {
        BookGenre comedy = new Comedy();
        Assert.assertTrue(comedy.getBook().getTitle().equalsIgnoreCase("The night watch"));

    }

}



