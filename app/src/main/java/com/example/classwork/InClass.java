package com.example.classwork;

public class InClass {
    private String privateVar = "Hello";
    String publicVar = "HELLO";
    static String  staticVar ="Bye";

    public static void main(String[] args) {
        InClass inClass = new InClass();
        inClass.callInnerClass();
        inClass.callNestedClass();

    }

    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerAge + " inner class called");
    }

    void callNestedClass(){
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass.nestedAge +  " nested class called");
        nestedClass.callOuterClassVariable();
    }

    class InnerClass{

        int innerAge = 10;

        void callOuterClassVariable(){
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
            callInnerClass();
        }
    }

    static class NestedClass{

        int nestedAge = 10;

        void callOuterClassVariable(){
            //System.out.println(privateVar);
            //System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }
}
