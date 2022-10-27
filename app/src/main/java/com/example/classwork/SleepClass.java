package com.example.classwork;

public class SleepClass {

    public static void main(String[] args) {

        ThreadClass6 threadClass6 = new ThreadClass6();
        threadClass6.start();
        long start = System.currentTimeMillis();
        System.out.println("called in thread: "
        + Thread.currentThread().getName() + " " + start);
    }
}

class ThreadClass6 extends Thread {

    private int count;

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("I run this code in: "
                 + thread.getName() + " " + start);
    }
}
