package parent.com.obey.ispAndLsp.impl;
import parent.com.obey.ispAndLsp.AudioBook;
import parent.com.obey.ispAndLsp.AudioBookDetails;

/**
 * Created by student on 2016/03/24.
 */
public class GetAudioDetails implements AudioBook {
    public AudioBookDetails getAudioBook()
    {
        AudioBookDetails details = new AudioBookDetails();
        details.setDuration(100.50);
        details.setTitle("BZRK");
        details.setAuthor("Michael Grant");
        return details;
    }
}
