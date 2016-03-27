package parent.com.disobey.ispAndLsp.impl;

import parent.com.disobey.ispAndLsp.BookDetails;
import parent.com.disobey.ispAndLsp.BookType;

/**
 * Created by student on 2016/03/23.
 */
public class AudioBook implements BookType {
    public BookDetails getBook()
    {
        BookDetails details = new BookDetails();
        details.setTitle("BZRK");
        details.setAuthor("Michael Grant");
        return details;
    }
        //Violation not setting pages. Audio books have no pages.
        //Interface violation only ask what needs to be done
}
