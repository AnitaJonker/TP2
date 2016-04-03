package bookSystem.impl;

import bookSystem.Books;
import bookSystem.RegisterBook;

/**
 * Created by student on 2016/03/31.
 */
public class Restricted extends BookDetails implements RegisterBook {

    public Books registerBook()
    {
        Books restricted = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return restricted;
    }
    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("Restricted")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }

}
