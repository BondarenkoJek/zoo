package com.bondarenkojek.animals;

public class Penguin implements Bird, Fish {
    @Override
    public void eat() {
        System.out.println("Penguin is eating!!!");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can not fly!");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming!!!");
    }
}
