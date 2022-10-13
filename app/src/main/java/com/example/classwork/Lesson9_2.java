package com.example.classwork;

import java.util.Arrays;

public class Lesson9_2 {
    //sorting massive
    public static void main(String[] args) {
        int[] massive = new int[]{16,-17,22,0,1,33,5,4,7};

        Arrays.sort(massive);
        int index = Arrays.binarySearch(massive, 5);
        System.out.println(index);
        System.out.println("\n");
        for (int i = 0; i <massive.length-1 ; i++) {
            System.out.println(massive[i] + " ");
        }
        System.out.println();
        index = Arrays.binarySearch(massive, 33);
        System.out.println(index);
//        int index = Arrays.binarySearch(massive, 5);
//        System.out.println(index);
//        for (int i = 0; i <=massive.length-1; i++) {
//            System.out.println(massive[i] + " ");
//        }
//        Arrays.sort(massive);
//        for (int i = 0; i <=massive.length-1; i++) {
//            System.out.println(massive[i] + " ");
//        }
//        System.out.println();
    }
}
