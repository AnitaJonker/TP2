package parent.com.disobey.ispAndLsp.impl;
import parent.com.disobey.ispAndLsp.BookDetails;
import parent.com.disobey.ispAndLsp.BookType;

/**
 * Created by student on 2016/03/23.
 */
public class TextBook implements BookType {
    public BookDetails getBook()
    {
        BookDetails details = new BookDetails();
        details.setPages(975);
        details.setTitle("BZRK");
        details.setAuthor("Michael Grant");
        return details;
    }

}
