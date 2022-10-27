package com.example.classwork;

public class ThreadingWork2 {
    //Второй способ создания потоков
    public static void main(String[] args) {

//        ThreadClass3 threadClass3 = new ThreadClass3(){
//            @Override
//            public void run() {
//                System.out.println("Run in Thread in anonym class");
//            }
//        };
//
//        threadClass3.start();
        //3 способ создания потоков
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("I'm running in thread");
            }
        };
        thread.start();
        //3 способ только через Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in runnable");
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}

class ThreadClass3 extends Thread {

    @Override
    public void run() {
        System.out.println("I'm running in thread");
    }
}

class ThreadClass4 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}
