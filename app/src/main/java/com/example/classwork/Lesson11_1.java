package com.example.classwork;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson11_1 {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        queue.offer("Hello");
        queue.offer("Bye");
        queue.offer("World");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
