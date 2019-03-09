package com.bondarenkojek;

import com.bondarenkojek.aviaries.Aviary;
import com.bondarenkojek.animals.Animal;

public interface Zoo {
    void addAviary(Aviary<? extends Animal> aviary);

    void feedAllAnimals();
}
