package main.java.com.sindhuk.datastructure.searching.javalibrary;

/**
 * Created by asraful on 10/1/2017.
 */
// Java program to demonstrate working of Collections.
// binarySearch() in an array sorted in descending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG3
{
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(2);

        // The last parameter specifies the comparator method
        // used for sorting.
        int index = Collections.binarySearch(al, 50,
                Collections.reverseOrder());

        System.out.println("Found at index " + index);
    }
}