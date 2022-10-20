package com.example.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson11_5 {

    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<Person>();

        arrayList.add(new Person("Sasha", 18));
        arrayList.add(new Person("Dima", 10));
        arrayList.add(new Person("Olya",21 ));
        arrayList.add(new Person("Sasha",25));
        arrayList.add(new Person("Sasha",32));


        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(Integer.valueOf(t1.getAge())
                );
            }
        });

        for (Person person : arrayList){
            System.out.println(person.getAge());
        }
    }
}

class  Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}