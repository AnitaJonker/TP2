package parent.com.disobey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.disobey.srp.BookDetails;


/**
 * Created by student on 2016/03/25.
 */
//DISOBEY
public class Srp {

    @Test
    public void testTitle()
    {
        BookDetails details = new BookDetails();
        Assert.assertEquals(details.getPages(),120);
    }

    @Test
    public void testPrice()
    {
        BookDetails details = new BookDetails();
        Assert.assertEquals(details.getBookPrice(),100.00);
    }

}
