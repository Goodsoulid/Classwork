package com.example.classwork;

import java.util.Arrays;

//public class Lesson9_3 {
//    public static void main(String[] args) {
//        int[] massive = new int[]{16,-17,0,1,33,5,4,7};
//        System.out.println(Arrays.toString(massive));
//    }
//}

public class Lesson9_3 {
    public static void main(String[] args) {
        int[] massive = new int[]{16,-17,0,1,33,5,4,7};
        for (int i = 0; i <massive.length; i++) {
            System.out.println(massive[i] + " ");
        }

        for (int element : massive){
            System.out.println(element + " ");
        }
    }
}
