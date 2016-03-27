package parent.com.disobey.plk;

/**
 * Created by student on 2016/03/24.
 */
public class BookStock {

    String title;

    public BookDetails setTitle() {
        BookDetails bookDetails = new BookDetails();
        bookDetails.setTitle("Harry Potter");
        bookDetails.setAuthor("JK Rowling");
        bookDetails.setPages(607);
        return bookDetails;
    }

    public void print()
    {
        System.out.println("The new book is Harry Potter");

    }

}
