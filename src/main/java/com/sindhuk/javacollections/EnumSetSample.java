package main.java.com.sindhuk.javacollections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by asraful on 9/28/2017.
 */

/*
Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.
*/

public class EnumSetSample {

    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private void sample(){
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        // Traversing elements
        Iterator<days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

    private void sample2(){
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:"+set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }

    private void sample3(){

    }

    public static void main(String args[]){
        EnumSetSample enumSetSample = new EnumSetSample();

        System.out.println("***********Start Test Collection***********");
        enumSetSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        enumSetSample.sample2();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        enumSetSample.sample3();
        System.out.println("***********End Test Collection***********");
    }
}
