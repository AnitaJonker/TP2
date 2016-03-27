package parent.com.obey.dip.impl;


import parent.com.obey.dip.BookDetails;
import parent.com.obey.dip.BookGenre;

/**
 * Created by student on 2016/03/23.
 */
public class TextBook implements BookGenre {

    public BookDetails getBook() {
        BookDetails details = new BookDetails();
        return details;
    }
}
