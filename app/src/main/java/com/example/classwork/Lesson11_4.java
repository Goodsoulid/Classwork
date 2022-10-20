package com.example.classwork;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson11_4 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("four");
        arrayList.add("five");

//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }

        int index = arrayList.indexOf("two");//доп-но прописываем String для этой ситуации в объекте
        arrayList.remove("two");
        System.out.print(arrayList);
    }
}


