package com.example.classwork;

import java.util.Arrays;

public class Lesson9_7 {
    //сортировка вставками
    public static void main(String[] args) {
        int massive[] = {1,5,-3,17,3,2,13};
        for (int i = 1; i < massive.length; i++) {
            int current = massive[i];
            int newValue = i -1;
            while (newValue>=0 && current < massive[newValue]){
                massive[newValue+1] = massive[newValue];
                newValue--;
            }
            massive[newValue+1] = current;
            System.out.println(Arrays.toString(massive));
        }
    }
}
