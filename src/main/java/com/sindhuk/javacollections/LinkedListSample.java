package main.java.com.sindhuk.javacollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by asraful on 9/28/2017.
 */

/*
Java LinkedList class uses doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

        The important points about Java LinkedList are:

        Java LinkedList class can contain duplicate elements.
        Java LinkedList class maintains insertion order.
        Java LinkedList class is non synchronized.
        In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
        Java LinkedList class can be used as list, stack or queue.
*/

public class LinkedListSample {

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
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void sample2(){
        //Creating list of Books
        List<Book> list=new LinkedList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    public static void main(String args[]){
        LinkedListSample linkedListSample = new LinkedListSample();
        System.out.println("***********Start Test Collection***********");
        linkedListSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println("***********Start Test Collection***********");
        linkedListSample.sample2();
        System.out.println("***********End Test Collection***********");

    }
}
