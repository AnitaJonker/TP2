package bookSystem.impl;

import bookSystem.Books;
import bookSystem.RegisterBook;

/**
 * Created by student on 2016/03/31.
 */
public class NonFiction extends BookDetails implements RegisterBook {

    public Books registerBook() {
        Books nonFiction = new Books.Builder()
                .bookTitle("Charlie and the chocolate factory.")
                .author("Roald Dahl")
                .pages(150)
                .publisher("Penguin Books")
                .build();
        return nonFiction;

    }

    public Books handleRequest(String request) {
        if (request.equalsIgnoreCase("nonFiction")) {
            return registerBook();
        } else {
            if (request != null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }
}
