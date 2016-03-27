package parent.com.disobey.dip;

/**
 * Created by student on 2016/03/23.
 */
public class BookDetails {

    String title = "Wasted";
    String author= "Meg Cabot";
    int pages = 120;
    String genre = "comedy";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
