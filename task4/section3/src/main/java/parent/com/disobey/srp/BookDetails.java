package parent.com.disobey.srp;

/**
 * Created by student on 2016/03/23.
 */
public class BookDetails {

    String title = "Wasted";
    String author= "Meg Cabot";
    int pages = 120;
    int bookAddedDate = 2010;
    double bookPrice = 100.00;

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

    public int getBookAddedDate() {
        return bookAddedDate;
    }

    public void setBookAddedDate(int bookAddedDate) {
        this.bookAddedDate = bookAddedDate;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

}
