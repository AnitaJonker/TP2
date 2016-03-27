package parent.com.obey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.obey.plk.BookBorrow;

/**
 * Created by student on 2016/03/25.
 */
//OBEY
public class Plk {
    @Test
    public void testTitle()
    {
        BookBorrow stock = new BookBorrow();
        Assert.assertEquals(stock.getTitle(),"Wasted");
    }
}
