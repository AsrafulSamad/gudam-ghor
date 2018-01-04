package main.java.com.sindhuk.javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by asraful on 9/28/2017.
 */


/*
Java Queue interface orders the element in FIFO(First In First Out) manner. In FIFO, first element is removed first and last element is removed at last.
&&
The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
*/

public class QueueSample {
    private void sample(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }


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

    private void sample2(){
        Queue<Book> queue=new PriorityQueue<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }


    public static void main(String args[]){
        QueueSample queueSample = new QueueSample();
        System.out.println("***********Start Test Collection***********");
        queueSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        queueSample.sample2();
        System.out.println("***********End Test Collection***********");

    }
}
