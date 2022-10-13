package com.example.classwork;

import java.util.Arrays;

public class Lesson9_5 {
    public static void main(String[] args) {
        int[] temps = new int[]{25,47,34,18,96,33,28,55,87,13};
        int minValue = 0;
        int maxValue = 0;
        Arrays.sort(temps);
        minValue = temps[0];
        maxValue = temps[temps.length-1];
        System.out.println("minValue: " + minValue + " MaxValue " + maxValue);

    }
}
