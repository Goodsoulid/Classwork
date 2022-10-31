package com.example.classwork;

public class ThreadDaemon {

    public static void main(String[] args) {
        ThreadClass5 threadClass5 = new ThreadClass5();
        threadClass5.setDaemon(true);
        threadClass5.start();
    }
}

class ThreadClass5 extends Thread{

    @Override
    public void run() {
        System.out.println("I'm a daemon thread " +
                Thread.currentThread().isDaemon());
    }
}
