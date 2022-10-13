package com.example.classwork;

public class Lesson9_4 {
    public static void main(String[] args) {
        int[] temp = new int[]{16,-17,22,0,21,33,5,4,-7};
        double averageTemp;
        int sumOfTemp = 0;
        for (int i = 0; i <temp.length; i++) {
            sumOfTemp += temp[i];
        }
        averageTemp = (double) sumOfTemp/temp.length;
        System.out.println(averageTemp);
    }
}
