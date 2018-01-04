package main.java.com.sindhuk.javacollections;

import java.util.*;

/**
 * Created by asraful on 9/28/2017.
 */

/*
ArrayList and Vector both implements List interface and maintains insertion order.

        But there are many differences between ArrayList and Vector classes that are given below.

        ArrayList	Vector
        1) ArrayList is not synchronized.	Vector is synchronized.
        2) ArrayList increments 50% of current array size if number of element exceeds from its capacity.	Vector increments 100% means doubles the array size if total number of element exceeds than its capacity.
        3) ArrayList is not a legacy class, it is introduced in JDK 1.2.	Vector is a legacy class.
        4) ArrayList is fast because it is non-synchronized.	Vector is slow because it is synchronized i.e. in multithreading environment, it will hold the other threads in runnable or non-runnable state until current thread releases the lock of object.
        5) ArrayList uses Iterator interface to traverse the elements.	Vector uses Enumeration interface to traverse the elements. But it can use Iterator also.
*/

public class VectorSample {

    private void sample(){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Sonoo");//adding object in arraylist
        al.add("Michael");
        al.add("James");
        al.add("Andy");
        //traversing elements using Iterator
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void sample2(){
        Vector<String> v=new Vector<String>();//creating vector
        v.add("umesh");//method of Collection
        v.addElement("irfan");//method of Vector
        v.addElement("kumar");
        //traversing elements using Enumeration
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

    private void sample3(){

    }

    public static void main(String args[]){
        VectorSample vectorSample = new VectorSample();


        System.out.println("***********Start Test Collection***********");
        vectorSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        vectorSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        vectorSample.sample3();
        System.out.println("***********End Test Collection***********");
    }
}
