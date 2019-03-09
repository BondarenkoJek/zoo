package com.bondarenkojek.animals;

public class Penguin implements Bird {
    public void eat() {
        System.out.println("Penguin is eating!!!");
    }

    public void fly() {
        System.out.println("Penguin can not fly! Penguin is swimming!!! ");
    }
}
