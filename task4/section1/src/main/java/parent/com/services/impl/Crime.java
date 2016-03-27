package parent.com.services.impl;

import parent.com.domain.Book;
import parent.com.services.BookGenre;

/**
 * Created by student on 2016/03/23.
 */
public class Crime implements BookGenre {

    public Book getBook() {
        Book book = new Book();
        book.setPages(500);
        book.setTitle("Sherlock");
        return book;
    }


}
