package main.java.com.sindhuk.javacollections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by asraful on 9/28/2017.
 */

/*
Java Deque Interface is a linear collection that supports element insertion and removal at both ends. Deque is an acronym for "double ended queue".

&&

The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.

        The important points about ArrayDeque class are:

        Unlike Queue, we can add or remove elements from both sides.
        Null elements are not allowed in the ArrayDeque.
        ArrayDeque is not thread safe, in the absence of external synchronization.
        ArrayDeque has no capacity restrictions.
        ArrayDeque is faster than LinkedList and Stack.
*/


public class DequeAndArrayDequeSample {

    private void sample(){
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }

    private void sample2(){
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
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

    private void sample3(){
        Deque<Book> set=new ArrayDeque<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to Deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing ArrayDeque
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }


    public static void main(String args[]){
        DequeAndArrayDequeSample dequeAndArrayDequeSample = new DequeAndArrayDequeSample();

        System.out.println("***********Start Test Collection***********");
        dequeAndArrayDequeSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        dequeAndArrayDequeSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        dequeAndArrayDequeSample.sample3();
        System.out.println("***********End Test Collection***********");


    }
}
