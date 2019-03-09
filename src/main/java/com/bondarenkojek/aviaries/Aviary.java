package com.bondarenkojek.aviaries;

import com.bondarenkojek.animals.Animal;

public interface Aviary<T extends Animal> {
    void feedAllAnimals();

    void addAnimal(T animal);
}
