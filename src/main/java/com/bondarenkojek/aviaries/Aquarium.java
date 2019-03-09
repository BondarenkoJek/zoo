package com.bondarenkojek.aviaries;

import com.bondarenkojek.animals.Fish;

import java.util.ArrayList;
import java.util.List;

public class Aquarium implements Aviary<Fish> {
    List<Fish> fishes;

    {
        fishes = new ArrayList<>();
    }

    @Override
    public void feedAllAnimals() {
        for (Fish fish : fishes) {
            fish.eat();
        }
    }

    @Override
    public void addAnimal(Fish animal) {
        fishes.add(animal);
    }
}
