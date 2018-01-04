package main.java.com.sindhuk.javacollections;

/**
 * Created by asraful on 9/28/2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


/*
Java Comparator interface is used to order the objects of user-defined class.

This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).

It provides multiple sorting sequence i.e. you can sort the elements on the basis of any data member, for example rollno, name, age or anything else.
*/

/*Difference between Comparable and Comparator

        Comparable and Comparator both are interfaces and can be used to sort collection elements.

        But there are many differences between Comparable and Comparator interfaces that are given below.

        Comparable	Comparator
        1) Comparable provides single sorting sequence. In other words, we can sort the collection on the basis of single element such as id or name or price etc.	Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
        2) Comparable affects the original class i.e. actual class is modified.	Comparator doesn't affect the original class i.e. actual class is not modified.
        3) Comparable provides compareTo() method to sort elements.	Comparator provides compare() method to sort elements.
        4) Comparable is found in java.lang package.	Comparator is found in java.util package.
        5) We can sort the list elements of Comparable type by Collections.sort(List) method.	We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.*/


public class ComparatorInterfaceSample {


    private void sample(){
        // Java Comparator Example (Non-generic Old Style)

        class Student{
            int rollno;
            String name;
            int age;
            Student(int rollno,String name,int age){
                this.rollno=rollno;
                this.name=name;
                this.age=age;
            }
        }

        class AgeComparator implements Comparator {
            public int compare(Object o1,Object o2){
                Student s1=(Student)o1;
                Student s2=(Student)o2;

                if(s1.age==s2.age)
                    return 0;
                else if(s1.age>s2.age)
                    return 1;
                else
                    return -1;
            }
        }

        class NameComparator implements Comparator{
            public int compare(Object o1,Object o2){
                Student s1=(Student)o1;
                Student s2=(Student)o2;

                return s1.name.compareTo(s2.name);
            }
        }



        ArrayList al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al,new NameComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al,new AgeComparator());
        Iterator itr2=al.iterator();
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }



    private void sample2(){
        //Java Comparator Example (Generic)
        class Student{
            int rollno;
            String name;
            int age;
            Student(int rollno,String name,int age){
                this.rollno=rollno;
                this.name=name;
                this.age=age;
            }
        }

        class AgeComparator implements Comparator<Student>{
            public int compare(Student s1,Student s2){
                if(s1.age==s2.age)
                    return 0;
                else if(s1.age>s2.age)
                    return 1;
                else
                    return -1;
            }
        }

        class NameComparator implements Comparator<Student>{
            public int compare(Student s1,Student s2){
                return s1.name.compareTo(s2.name);
            }
        }


        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }

    private void sample3(){

    }



    public static void main(String args[]){
        ComparatorInterfaceSample comparatorInterfaceSample = new ComparatorInterfaceSample();


        System.out.println("***********Start Test Collection***********");
        comparatorInterfaceSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        comparatorInterfaceSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        comparatorInterfaceSample.sample3();
        System.out.println("***********End Test Collection***********");
    }
}
