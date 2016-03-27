package parent.com.disobey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.disobey.plk.BookStock;

/**
 * Created by student on 2016/03/25.
 */
//DISOBEY
public class Plk {
    @Test
    public void testTitle()
    {
        BookStock stock = new BookStock();
        Assert.assertEquals(stock.setTitle().getTitle(),"Harry Potter");
    }
}
