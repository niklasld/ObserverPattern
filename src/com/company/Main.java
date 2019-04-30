package com.company;

public class Main {

    public static void main(String[] args) {

        ConSubject subject = new ConSubject(3);

        new ConObserver(subject, "Observer A");
        new ConObserver(subject, "Observer B");
        new ConObserver(subject, "Observer C");
        System.out.println("state currently 3");

        subject.changeState(5);

        System.out.println("state currently 5");

        subject.changeState(10);

    }
}
