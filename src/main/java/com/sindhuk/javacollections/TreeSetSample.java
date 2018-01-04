package main.java.com.sindhuk.javacollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by asraful on 9/28/2017.
 */


/*
Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements NavigableSet interface. The objects of TreeSet class are stored in ascending order.

    The important points about Java TreeSet class are:

    Contains unique elements only like HashSet.
    Access and retrieval times are quiet fast.
    Maintains ascending order.
*/

public class TreeSetSample {

    class Book implements Comparable<Book>{
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
        public int compareTo(Book b) {
            if(id>b.id){
                return 1;
            }else if(id<b.id){
                return -1;
            }else{
                return 0;
            }
        }
    }

    private void sample(){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void sample2(){
        Set<Book> set=new TreeSet<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }


    public static void main(String args[]){
        TreeSetSample treeSetSample = new TreeSetSample();
        System.out.println("***********Start Test Collection***********");
        treeSetSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println("***********Start Test Collection***********");
        treeSetSample.sample2();
        System.out.println("***********End Test Collection***********");

    }
}
