package bookSystem.impl;

import bookSystem.Books;

/**
 * Created by student on 2016/04/03.
 */
public abstract class BookDetails {

    BookDetails nextType;

    public void setNextBookType(BookDetails nextType) {
        this.nextType = nextType;
    }
    public abstract Books handleRequest(String request);
}
