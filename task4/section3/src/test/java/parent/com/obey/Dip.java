package parent.com.obey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.obey.dip.BookGenre;
import parent.com.obey.dip.impl.TextBook;

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
