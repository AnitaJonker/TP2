package parent.com.disobey;


import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.disobey.dip.BookGenre;
import parent.com.disobey.dip.impl.TextBook;

/**
 * Created by student on 2016/03/27.
 */
public class Dip {
    @Test
    public void testTitle()
    {
        BookGenre genre = new TextBook();
        Assert.assertEquals(genre.getBook().getGenre(),"comedy");

    }
}
