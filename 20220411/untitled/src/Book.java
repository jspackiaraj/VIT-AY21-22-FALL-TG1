public class Book {
    String title;
    String author;
    String isbn;
    // PUTTER METHOD (Constructor Methods)
    public Book(String newTitle, String newAuthor, String newIsbn){
        title = newTitle;
        author = newAuthor;
        isbn = newIsbn;
    }
    public Book(){
        title = "How to program Java";
        author = "JSP";
        isbn = "123-4673-297";
    }
    // GETTER METHODS (Observer Methods)
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
}
