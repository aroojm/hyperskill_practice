import java.util.Arrays;

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
    public String toString() {
        return String.format("title=%s,yearOfPublishing=%d,authors=[%s]",title,yearOfPublishing, String.join(",",authors));
    }
}