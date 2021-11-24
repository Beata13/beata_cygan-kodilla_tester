public class Book {
    private  String author;
    private  String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static  Book Of(String author, String title) {

return new Book ( author, title);
    }
}