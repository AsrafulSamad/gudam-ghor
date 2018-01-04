package main.java.com.sindhuk.javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by asraful on 9/28/2017.
 */

/*
A map contains values on the basis of key i.e. key and value pair. Each key and value pair is known as an entry. Map contains only unique keys.

Map is useful if you have to search, update or delete elements on the basis of key.
*/

public class MapInterfaceSample {

    // Generic (New Style)
    private void sample(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    private void sample2(){
        Map map=new HashMap();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String args[]){
        MapInterfaceSample mapInterfaceSample = new MapInterfaceSample();

        System.out.println("***********Start Test Collection***********");
        mapInterfaceSample.sample();
        System.out.println("***********End Test Collection***********");

        System.out.println();

        System.out.println("***********Start Test Collection***********");
        mapInterfaceSample.sample2();
        System.out.println("***********End Test Collection***********");
    }
}
