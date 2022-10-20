package com.example.classwork;

import java.util.HashMap;
import java.util.TreeMap;

public class Lesson11_3 {
    public static void main(String[] args) {

//        HashMap hashMap = new HashMap();
//        hashMap.put("Planet", "Saturn");
//        hashMap.put("Earth", "Country");
//        hashMap.put("Animal", "cat");
//        hashMap.put("Earth", "Ocean");
//
//
//        System.out.println(hashMap.values());

        TreeMap hashMap = new TreeMap();
        hashMap.put("A", "C");
        hashMap.put("D", "A");
        hashMap.put("B", "D");
        hashMap.put("C", "B");


        System.out.println(hashMap);

    }
}
