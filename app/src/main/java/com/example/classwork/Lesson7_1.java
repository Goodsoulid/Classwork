package com.example.classwork;

public class Lesson7_1 {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Mum mum = new Mum();
        checkType(mum);

        Lesson7_1 lesson7_1 = new Lesson7_1();
        System.out.println(lesson7_1.getname(""));

    }

    String getname(String name){
        if (name.isEmpty()){
            return "NAME CAN'T BE EMPTY";
        }else
        return name;
    }


     static void checkType(Object object){
        if (object instanceof Mum){
            ((Mum) object).walk();
        } else {
            System.out.println("not parent");
        }
    }

}

class Parent{
    void walk(){
        System.out.println("parent walk");

    }

}

class Dad extends Parent{
    void walk(){
        System.out.println("dad walk");
    }

}

class Mum extends Parent{
    void walk(){
        System.out.println("mum walk");
    }

    void sleep(){
        System.out.println("mum is sleeping");
    }

}




