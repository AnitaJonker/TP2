package parent.com.disobey.ocp;

/**
 * Created by student on 2016/03/23.
 */
public class SearchBook {

    public String getTitle()
    {
        BookDatabase database = new BookDatabase();
        return database.getTitle();
    }











}
