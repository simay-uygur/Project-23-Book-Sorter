import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Main {
    
    public static void main(String[] args) { 
        //set srtuctures : Hashset, TreeSet, LinkedHashSet 

        Book book1 = new Book("The Art of War" ,200, "Sun Tzu", 1500);
        Book book2 = new Book("Perfected",300, "Kate Jarvik Birch", 2014);
        Book book3 = new Book("Me, You and Lenin",310, "Robert Roskind", 2015);
        Book book4 = new Book("Naked Sun",255, "Isaac Asimov", 1957);
        Book book5 = new Book("The Song of Achilles",115, "Madeline Miller", 2011);

        //ordering according to the name (somehow reversed)
        HashSet<Book> hashSet = new HashSet<Book>();
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        hashSet.add(book4);
        hashSet.add(book5);
        
        
        System.out.println(hashSet.toString());

        //ordering according to the page number
        TreeSet<Book> treeSet = new TreeSet<Book>(new OrderByPageComparator());
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        treeSet.add(book4);
        treeSet.add(book5);

        System.out.println(treeSet.toString());

        //Linked hashset cannot be used because it does not have a comparator and it remembers the order the elements are added (stable) therefore i didn't use it here
    }
}
