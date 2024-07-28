/**
 * Book
 */
public class Book implements Comparable<Book> {
    String name;
    int pageNumber;
    String author;
    int publicationYear;

    Book() {
        this.name = "";
        this.pageNumber=0;
    }

    Book(String name, int number, String author, int year) {
        this.name = name;
        this.pageNumber = number;
        this.author = author;
        this.publicationYear = year;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name); 
    }
    
    public String toString() {
        return this.name + " : " + this.pageNumber;
    } 
    
}