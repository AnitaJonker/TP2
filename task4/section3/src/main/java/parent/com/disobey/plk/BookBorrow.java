package parent.com.disobey.plk;

/**
 * Created by student on 2016/03/24.
 */
public class BookBorrow {
    BookStock stock = new BookStock();

    public void getBookDetails()
    {
        stock.setTitle().getTitle(); //violation* access to my neighbor's neighbor
    }

}
