package parent.com.obey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.obey.ispAndLsp.AudioBook;
import parent.com.obey.ispAndLsp.TextBook;
import parent.com.obey.ispAndLsp.impl.GetAudioDetails;
import parent.com.obey.ispAndLsp.impl.GetBookDetails;

/**
 * Created by student on 2016/03/25.
 */
public class IspAndLsp {

    @Test
    public void testTitle()
    {
        TextBook book = new GetBookDetails();
        Assert.assertEquals(book.getBook().getTitle(),"BZRK");
    }

    @Test
    public void testDuration()
    {
        AudioBook audioBook = new GetAudioDetails();
        Assert.assertEquals(audioBook.getAudioBook().getDuration() ,100.50);
    }
}
