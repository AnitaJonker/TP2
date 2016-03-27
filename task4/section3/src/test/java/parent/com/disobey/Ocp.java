package parent.com.disobey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.disobey.ocp.SearchBook;

/**
 * Created by student on 2016/03/25.
 */
//DISOBEY
public class Ocp {
    @Test
    public void testTitle()
    {
        SearchBook searchBook = new SearchBook();
        Assert.assertEquals(searchBook.getTitle(),"Charlie and the chocolate factory");
    }
}
