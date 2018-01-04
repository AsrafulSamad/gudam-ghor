package main.java.com.sindhuk.javacollections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by asraful on 9/28/2017.
 */

/*Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

        The important points about Java HashSet class are:

        HashSet stores the elements by using a mechanism called hashing.
        HashSet contains unique elements only.*/

public class HashSetSample {

    class Book {
        int id;
        String name,author,publisher;
        int quantity;
        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }
    }

    private void sample(){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void sample2(){
        HashSet<Book> set=new HashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    public static void main(String args[]){
        HashSetSample hashSetSample = new HashSetSample();

        System.out.println("***********Start Test Collection***********");
        hashSetSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        hashSetSample.sample2();
        System.out.println("***********End Test Collection***********");

    }

}
