package com.example.classwork;

public class Anonimus {

    static IRepository iRepository = new IRepository() {  //anonym class ( with help of
        @Override
        public void login(String userName, String password) {
            System.out.println("hello");
        }
    };

    static  Anonym anonym = new Anonym(){  // anonym class
        @Override
        void hackNetwork() {
            super.hackNetwork(); //parent behavior
            System.out.println("child hacked the world"); //переделали родительский класс
        }
    };

    public static void main(String[] args) {
        iRepository.login("user name","password");
        Anonym anonym = new Anonym(){
            @Override
            void hackNetwork() {
                super.hackNetwork();
            }
        };
        anonym.hackNetwork();


    }
}

class Anonym {

    void hackNetwork(){
        System.out.println("I hacked the world");
    }
}
