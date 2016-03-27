package parent.com.disobey.dip.impl;


import parent.com.disobey.dip.BookDetails;
import parent.com.disobey.dip.BookGenre;

/**
 * Created by student on 2016/03/23.
 */
public class TextBook implements BookGenre {

    public BookDetails getBook() {
        BookDetails details = new BookDetails();
        char genreCat = details.getGenre().charAt(0);

        switch (genreCat) {
            case 'c':
                details.setGenre("comedy");
                break;
            case 'h':
                details.setGenre("horror");
                break;
            default:
                details.setGenre("Unknown");
        }
        return details;
    }






}
