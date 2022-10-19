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

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                for (int k = 0; k < numbers[i][j].length; k++){
                    System.out.print(numbers[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
