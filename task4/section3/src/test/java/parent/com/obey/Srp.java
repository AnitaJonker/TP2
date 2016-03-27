package parent.com.obey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.obey.srp.BookDetails;
import parent.com.obey.srp.BookStock;

/**
 * Created by student on 2016/03/25.
 */
public class Srp {

    //BookBorrow

    @Test
    public void testPrice()
    {
        BookStock stock = new BookStock();
        Assert.assertEquals(stock.getBookPrice(),250.00);
    }

    @Test
    public void testDate()
    {
        BookStock stock = new BookStock();
        Assert.assertEquals(stock.getBookAddedDate(),2010);
    }

    //BookDetails

    @Test
    public void testTitle()
    {
        BookDetails details = new BookDetails();
        Assert.assertEquals(details.getPages(),300);
    }

}
