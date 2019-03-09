package com.bondarenkojek;

import com.bondarenkojek.aviaries.Aviary;
import com.bondarenkojek.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class KyivZoo implements Zoo {
    private List<Aviary<? extends Animal>> aviaries;

    {
        aviaries = new ArrayList<>();
    }

    @Override
    public void addAviary(Aviary<? extends Animal> aviary) {
        aviaries.add(aviary);
    }

    @Override
    public void feedAllAnimals() {
        for (Aviary<? extends Animal> aviary : aviaries) {
            aviary.feedAllAnimals();
        }
    }
}
