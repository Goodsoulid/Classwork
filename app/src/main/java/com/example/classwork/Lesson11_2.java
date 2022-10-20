package com.example.classwork;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Lesson11_2 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.addLast("python developer");
        arrayDeque.add("ios developer");
        arrayDeque.push("flutter developer");//добавление вперёд очереди, если он написан последним
        arrayDeque.addFirst("android developer");//тоже что и push
        arrayDeque.addFirst("android developer");//тоже что и push
        arrayDeque.addFirst("android developer");//тоже что и push

        System.out.println(arrayDeque);

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.println(arrayList.get(2));

        Set<String > set = new TreeSet<String>();//переносим из ArrayList в Set и убираем дубликаты
        set.addAll(arrayList);
        System.out.println(set);

    }
}
