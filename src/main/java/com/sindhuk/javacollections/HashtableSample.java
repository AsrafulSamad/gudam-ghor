package main.java.com.sindhuk.javacollections;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by asraful on 9/28/2017.
 */


/*Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.

        The important points about Java Hashtable class are:

        A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
        It contains only unique elements.
        It may have not have any null key or value.
        It is synchronized.
*/

/*HashMap and Hashtable both are used to store data in key and value form. Both are using hashing technique to store unique keys.

        But there are many differences between HashMap and Hashtable classes that are given below.

        HashMap	Hashtable
        1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.	Hashtable is synchronized. It is thread-safe and can be shared with many threads.
        2) HashMap allows one null key and multiple null values.	Hashtable doesn't allow any null key or value.
        3) HashMap is a new class introduced in JDK 1.2.	Hashtable is a legacy class.
        4) HashMap is fast.	Hashtable is slow.
        5) We can make the HashMap as synchronized by calling this code
        Map m = Collections.synchronizedMap(hashMap);	Hashtable is internally synchronized and can't be unsynchronized.
        6) HashMap is traversed by Iterator.	Hashtable is traversed by Enumerator and Iterator.
        7) Iterator in HashMap is fail-fast.	Enumerator in Hashtable is not fail-fast.
        8) HashMap inherits AbstractMap class.	Hashtable inherits Dictionary class.
*/

public class HashtableSample {

    private void sample(){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    private void sample2(){
        // create and populate hash table
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(102,"Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");
        System.out.println("Values before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);
    }

    private void sample3(){
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

        //Creating map of Books
        Map<Integer,Book> map=new Hashtable<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
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
        HashtableSample hashtableSample = new HashtableSample();

        System.out.println("***********Start Test Collection***********");
        hashtableSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        hashtableSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        hashtableSample.sample3();
        System.out.println("***********End Test Collection***********");

    }
}
