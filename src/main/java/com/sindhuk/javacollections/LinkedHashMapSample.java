package main.java.com.sindhuk.javacollections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by asraful on 9/28/2017.
 */


/*
Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

        The important points about Java LinkedHashMap class are:

        A LinkedHashMap contains values based on the key.
        It contains only unique elements.
        It may have one null key and multiple null values.
        It is same as HashMap instead maintains insertion order.
*/

public class LinkedHashMapSample {

    private void sample(){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    private void sample2(){
        // Create and populate linked hash map
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(101,"Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);
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
        //Creating map of Books
        Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    public static void main(String args[]){
        LinkedHashMapSample linkedHashMapSample = new LinkedHashMapSample();

        System.out.println("***********Start Test Collection***********");
        linkedHashMapSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        linkedHashMapSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        linkedHashMapSample.sample3();
        System.out.println("***********End Test Collection***********");

    }
}
