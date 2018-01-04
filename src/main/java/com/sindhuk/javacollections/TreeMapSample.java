package main.java.com.sindhuk.javacollections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by asraful on 9/28/2017.
 */

/*
Java TreeMap class implements the Map interface by using a tree. It provides an efficient means of storing key/value pairs in sorted order.

        The important points about Java TreeMap class are:

        A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
        It contains only unique elements.
        It cannot have null key but can have multiple null values.
        It is same as HashMap instead maintains ascending order.
*/

public class TreeMapSample {
    private void sample(){
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    private void sample2(){
        // Create and populate tree map
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(102,"Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");
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
        Map<Integer,Book> map=new TreeMap<Integer,Book>();
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
        TreeMapSample treeMapSample = new TreeMapSample();

        System.out.println("***********Start Test Collection***********");
        treeMapSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        treeMapSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        treeMapSample.sample3();
        System.out.println("***********End Test Collection***********");

    }
}
