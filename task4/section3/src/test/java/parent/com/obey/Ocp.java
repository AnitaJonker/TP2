package parent.com.obey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.obey.ocp.SearchBook;

/**
 * Created by student on 2016/03/25.
 */
//OBEY
public class Ocp {
    @Test
    public void testTitle()
    {
        SearchBook searchBook = new SearchBook();
        Assert.assertEquals(searchBook.getTitle(),"Lost");
    }

}
