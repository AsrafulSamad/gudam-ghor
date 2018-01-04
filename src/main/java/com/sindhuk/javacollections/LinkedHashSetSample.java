package main.java.com.sindhuk.javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by asraful on 9/28/2017.
 */

/*
Java LinkedHashSet class is a Hash table and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

The important points about Java LinkedHashSet class are:

Contains unique elements only like HashSet.
Provides all optional set operations, and permits null elements.
Maintains insertion order.
*/


public class LinkedHashSetSample {

    private void sample(){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

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

    private void sample2(){
        LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    public static void main(String args[]){
        LinkedHashSetSample linkedHashSetSample = new LinkedHashSetSample();

        System.out.println("***********Start Test Collection***********");
        linkedHashSetSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        linkedHashSetSample.sample2();
        System.out.println("***********End Test Collection***********");

    }
}
