package com.example.classwork;

import org.xml.sax.DTDHandler;

public class Lesson7 {



    static IRepository iRepository;

    public static void main(String[] args) {

        iRepository = new RepositoryImpl();

        Shop shop = Shop.CLOSE;

        switch (shop){
            case OPEN:
                System.out.println("shop is open");
                break;
            case CLOSE:
                System.out.println("shop is closed");
                break;
        }



        iRepository.login("user name", "123456");
        }


    }

enum Shop {
    OPEN,
    CLOSE
}

