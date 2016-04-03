package bookSystem.impl;

import bookSystem.Books;
import bookSystem.RegisterBook;

/**
 * Created by student on 2016/03/31.
 */
public class YoungAdult extends BookDetails implements RegisterBook {

    public Books registerBook()
    {
        Books yA = new Books.Builder()
                .bookTitle("The fault in our stars.")
                .author("John Green")
                .pages(340)
                .publisher("Dutton Penguin")
                .build();
        return yA;

    }
    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("YA")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }

}
