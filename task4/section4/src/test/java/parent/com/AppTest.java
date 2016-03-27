package parent.com;


import disobey.adp.ScanAndPrint;
import disobey.adp.impl.UsePrinter;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testPrinter()
    {
        ScanAndPrint scanAndPrint = new UsePrinter();
        Assert.assertEquals(scanAndPrint.print(),"Out of paper");
    }
}
