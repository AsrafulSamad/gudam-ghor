package main.java.com.sindhuk.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by asraful on 9/28/2017.
 */

/*
We can sort the elements of:

        String objects
        Wrapper class objects
User-defined class objects
Collections class provides static methods for sorting the elements of collection.If collection elements are of Set type, we can use TreeSet.But We cannot sort the elements of List.Collections class provides methods for sorting the elements of List type elements.
*/

public class SortingInCollection {

    private void sample(){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void sample2(){
        ArrayList al=new ArrayList();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        al.add(230);//internally will be converted into objects as Integer.valueOf(230)

        Collections.sort(al);

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    private void sample3(){
        /*
        Java Comparable interface is used to order the objects of user-defined class.This interface is found in java.lang package and contains only one method named compareTo(Object).
        It provide single sorting sequence only i.e. you can sort the elements on based on single data member only. For example it may be rollno, name, age or anything else.

        We can sort the elements of:

        String objects
        Wrapper class objects
        User-defined class objects

        Collections class provides static methods for sorting the elements of collections. If collection elements are of Set or Map, we can use TreeSet or TreeMap.
        But We cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.

        */
        class Student implements Comparable<Student>{
            int rollno;
            String name;
            int age;
            Student(int rollno,String name,int age){
                this.rollno=rollno;
                this.name=name;
                this.age=age;
            }

            public int compareTo(Student st){
                if(age==st.age)
                    return 0;
                else if(age>st.age)
                    return 1;
                else
                    return -1;
            }
        }

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }

    public static void main(String args[]){
        SortingInCollection sortingInCollection  = new SortingInCollection();

        System.out.println("***********Start Test Collection***********");
        sortingInCollection.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        sortingInCollection.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        sortingInCollection.sample3();
        System.out.println("***********End Test Collection***********");
    }
}
