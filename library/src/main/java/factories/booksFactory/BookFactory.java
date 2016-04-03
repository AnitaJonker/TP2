package factories.booksFactory;

import bookSystem.Books;

/**
 * Created by student on 2016/04/02.
 */
public  interface  BookFactory {
     Books getBook(String bookTitle);
}
