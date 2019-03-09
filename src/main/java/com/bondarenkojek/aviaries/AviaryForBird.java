package com.bondarenkojek.aviaries;

import com.bondarenkojek.animals.Bird;

import java.util.ArrayList;
import java.util.List;

public class AviaryForBird implements Aviary<Bird> {
    private List<Bird> birds;

    {
        birds = new ArrayList<>();
    }

    @Override
    public void feedAllAnimals() {
        for (Bird bird : birds) {
            bird.fly();
        }
    }

    @Override
    public void addAnimal(Bird animal) {
        birds.add(animal);
    }
}
