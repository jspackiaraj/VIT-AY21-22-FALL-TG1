import java.util.Scanner;
public class TestBook {
    public static void main(String[] args) {
        {
            String title;
            String author;
            String isbn;
            Book FirstBook = new Book();
            System.out.println("Result of the first Constructor:");
            System.out.println("The default book is " + FirstBook.getTitle()
            + " by " + FirstBook.getAuthor()
            + " with ISBN number " + FirstBook.getIsbn());

            Book SecondBook;
            Scanner inputObject = new Scanner(System.in);
            System.out.print("Enter the Title of the Book : ");
            title = inputObject.nextLine();
            System.out.print("Enter the author of the Book : ");
            author = inputObject.nextLine();
            System.out.print("Enter the ISBN number of the Book : ");
            isbn = inputObject.nextLine();
            SecondBook = new Book(title, author, isbn);
            System.out.println("The entered book is " + SecondBook.getTitle()
                    + " by " + SecondBook.getAuthor()
                    + " with ISBN number " + SecondBook.getIsbn());
        }
    }
}
