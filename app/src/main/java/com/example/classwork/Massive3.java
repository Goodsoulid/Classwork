package com.example.classwork;

public class Massive3 {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9}
                }
        };

        for (int numbers2D = 0; numbers2D < numbers.length; numbers2D++){
            for (int numbers1D = 0; numbers1D < numbers[numbers2D].length; numbers1D++){
                for (int numbers1 = 0; numbers1 < numbers[numbers2D][numbers1D].length; numbers1++){
                    System.out.print(numbers[numbers2D][numbers1D][numbers1] + "\t");
                }
                System.out.println();
            }
        }
    }
}
