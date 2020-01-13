package com.udemy.learning.oops.abstraction;

import java.util.ArrayList;
import java.util.List;

interface Mobile {
    void calling(String number);

    void sendMessage(String message);
}

class Apple implements Mobile {

    private List<String> contacts = new ArrayList<>();

    public void addContact(String number) {
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling from Apple....." + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message from Apple....." + message);
    }
}

abstract class MobilePhone {
    List<String> contacts = new ArrayList<>();

    abstract void calling(String number);

    abstract void sendMessage(String message);

    public void addContact(String number) {
        contacts.add(number);
    }
}

class Samsung extends MobilePhone {

    @Override
    void calling(String number) {
        System.out.println("Calling from Samsung....." + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message from Samsung....." + message);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Apple iPhone = new Apple();
        iPhone.addContact("987373936435");
        iPhone.calling("987373936435");
        iPhone.sendMessage("Hello, how are you?");

        Samsung galaxy = new Samsung();
        galaxy.addContact("7923737373033");
        galaxy.calling("7923737373033");
        galaxy.sendMessage("Hello, how are you?");
    }
}
