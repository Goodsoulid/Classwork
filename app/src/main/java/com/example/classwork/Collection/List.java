package com.example.classwork.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class List {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.add("hello");
//        arrayList.add("bye");
//        arrayList.add("world");
//
//        System.out.println(arrayList.indexOf("bye"));
//        arrayList.add(1,"hi");
//        System.out.println(arrayList.indexOf("bye"));

//        LinkedList<String > linkedList = new LinkedList();
//        linkedList.add("hello");
//        System.out.println(arrayList);
//        System.out.println(linkedList);

//        SortedSet sortedSet = new TreeSet();
//        sortedSet.add("banana");
//        sortedSet.add("apple");
//        sortedSet.add("orange");
//        sortedSet.add("banana");
//
//        System.out.println(sortedSet);

        HashSet hashSet = new HashSet<Student>();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Masha"));
        hashSet.add(new Student("Sasha"));
        hashSet.add("");

        System.out.println(hashSet.size());
    }

}

class Student {
    private String name;

    Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
