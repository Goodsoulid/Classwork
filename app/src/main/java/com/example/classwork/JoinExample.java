package com.example.classwork;

public class JoinExample {

    public static void main(String[] args) {
        System.out.println("Main thread is running");

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Second thread is running");
            }
        };

        thread.start();

        try {
            thread.join();
        }catch (Exception e){
            System.out.println("caught exception");
        }

        System.out.println("Main thread is finished");
    }
}
//Пример метода Super,почему именно мы постоянно будем убирать метод Super
//class Parent {
//
//    void callType(){
//        System.out.println("parent");
//    }
//}
//
//class Child extends Parent{
//    @Override
//    void callType() {
//        super.callType();
//    }
//}