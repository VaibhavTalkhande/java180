class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" is added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are");
        for (String book:this.books
             ) {
            if(book==null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++) {
            if (this.books[i].equals(book)){
                System.out.println(book+" book has been issued \n Thanks!");
                books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
