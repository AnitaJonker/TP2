package parent.com.obey.ispAndLsp.impl;
import parent.com.obey.ispAndLsp.BookDetails;
import parent.com.obey.ispAndLsp.TextBook;

/**
 * Created by student on 2016/03/23.
 */
public class GetBookDetails implements TextBook {
    public BookDetails getBook()
    {
        BookDetails details = new BookDetails();
        details.setPages(974);
        details.setTitle("BZRK");
        details.setAuthor("Michael Grant");
        return details;
    }
}
