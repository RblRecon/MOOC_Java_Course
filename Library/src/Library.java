import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection;

    public Library() {
        this.collection = new HashMap<String, Book>();
    }

    public void addBook(Book book) {
        String name = stringCleaner(book.getName());

        if(this.collection.containsKey(name)) {
            System.out.println("The book is already in the library!");
        } else {
            collection.put(name, book);
        }
    }

    public void removeBook(String bookName) {
        bookName = stringCleaner(bookName);

        if(this.collection.containsKey(bookName)) {
            this.collection.remove(bookName);
        } else {
            System.out.println("The book was not found, you can't remove it!");
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }
    
    public Book getBookUsingItsBeginningChar(String beginning)
    {
    	beginning = stringCleaner(beginning);
    	return null;
    }
    
    public ArrayList<Book> bookList() {
        return new ArrayList<Book>(this.collection.values());
    }
    
}