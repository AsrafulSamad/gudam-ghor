package main.java.com.sindhuk.javacollections;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by asraful on 9/28/2017.
 */

/*
* Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
* */

public class EnumMapSample {
    // create an enum
    public enum Days {
        Monday, Tuesday, Wednesday, Thursday
    };

    private void sample(){
        //create and populate enum map
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday, "3");
        map.put(Days.Thursday, "4");
        // print the map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
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

    // Creating enum
    public enum Key{
        One, Two, Three
    };

    private void sample2(){
        EnumMap<Key, Book> map = new EnumMap<Key, Book>(Key.class);
        // Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        // Adding Books to Map
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);
        // Traversing EnumMap
        for(Map.Entry<Key, Book> entry:map.entrySet()){
            Book b=entry.getValue();
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    private void sample3(){

    }

    public static void main(String args[]){
        EnumMapSample enumMapSample = new EnumMapSample();

        System.out.println("***********Start Test Collection***********");
        enumMapSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        enumMapSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        enumMapSample.sample3();
        System.out.println("***********End Test Collection***********");
    }
}
