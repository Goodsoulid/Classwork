package com.example.classwork;

public class Lesson9 {
    public static void main(String[] args) {
        String[] massive = {"hello", "bye", "world"};
        int[] massive2 = new int[]{};
        massive2[0] = 1;
        massive2[1] = 2;
        massive2[2] = 3;
        massive2[3] = 4;
        massive2[4] = 5;

        System.out.println(massive[0]);
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i] + "\n");
        }

        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i] + "\n");
        }
    }
}
