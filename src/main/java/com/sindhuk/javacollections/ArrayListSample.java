package main.java.com.sindhuk.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asraful on 9/22/2017.
 *
 */

/*
Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

        The important points about Java ArrayList class are:

        Java ArrayList class can contain duplicate elements.
        Java ArrayList class maintains insertion order.
        Java ArrayList class is non synchronized.
        Java ArrayList allows random access because array works at the index basis.
        In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
*/

public class ArrayListSample {
    public void testCollection1() {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void testCollection2() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        for (String obj : al)
            System.out.println(obj);
    }

    public void testCollection3() {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        al.addAll(al2);//adding second list in first list
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void testCollection4() {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.removeAll(al2);
        System.out.println("iterating the elements after removing the elements of al2...");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void testCollection5() {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2...");
        Iterator itr=al.iterator();
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

    public void testCollection6() {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();
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
        ArrayListSample arrayListSample = new ArrayListSample();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection1();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection3();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection4();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection5();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        arrayListSample.testCollection6();
        System.out.println("***********End Test Collection***********");
    }
}
