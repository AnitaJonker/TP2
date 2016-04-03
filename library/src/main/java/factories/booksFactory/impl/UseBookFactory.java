package factories.booksFactory.impl;

import bookSystem.Books;
import bookSystem.impl.*;
import factories.booksFactory.BookFactory;

/**
 * Created by student on 2016/04/02.
 */
public class UseBookFactory implements BookFactory {


    Books book;

    public Books getBook(String bookTitle) {
        BookDetails chain = setUpChain();
        return chain.handleRequest(bookTitle);
    }





    public static BookDetails setUpChain(){
        BookDetails adultBook = new AdultBook();
        BookDetails kidBook = new Kid();
        BookDetails nonFiction = new NonFiction();
        BookDetails restricted = new Restricted();
        BookDetails yA = new YoungAdult();
        adultBook.setNextBookType(kidBook);
        kidBook.setNextBookType(nonFiction);
        nonFiction.setNextBookType(restricted);
        restricted.setNextBookType(yA);
        return adultBook;
    }

}
