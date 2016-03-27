package parent.com.disobey;

import org.testng.Assert;
import org.testng.annotations.Test;
import parent.com.disobey.ispAndLsp.BookType;
import parent.com.disobey.ispAndLsp.impl.AudioBook;

/**
 * Created by student on 2016/03/25.
 */
public class IspAndLsp {

    @Test
    public void testTitle()
    {
        BookType searchBook = new AudioBook();
       Assert.assertNotNull(searchBook.getBook().getPages());
    }
//No value has been set
}
