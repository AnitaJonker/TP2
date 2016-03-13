package services.implementations;

import com.parent.domain.Books;
import services.BookServices;

/**
 * Created by student on 2016/03/13.
 */
public class BookDetails implements BookServices {
    public Books getBookData()
    {
        Books book = new Books();
        book.setAuthor("JK Rowling");
        book.setBookName("Harry Potter and the Philosopher's stone");
        book.setPageNumber(190);
        book.setYearPublished(1998);
        return book;
    }




}
