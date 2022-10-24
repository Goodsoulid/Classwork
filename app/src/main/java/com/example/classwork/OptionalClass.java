package com.example.classwork;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        Optional<Integer> optInt = Optional.empty();
        if(optInt.isPresent()){
            System.out.println(optInt.get());
        }else {
            System.out.println("no value");
        }
    }
}
