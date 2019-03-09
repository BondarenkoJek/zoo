package com.bondarenkojek.aviaries;

import com.bondarenkojek.animals.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AviaryForMammal implements Aviary<Mammal> {
    private List<Mammal> mammals;

    {
        mammals = new ArrayList<>();
    }

    @Override
    public void feedAllAnimals() {
        for (Mammal mammal : mammals) {
            mammal.eat();
        }
    }

    @Override
    public void addAnimal(Mammal animal) {
        mammals.add(animal);
    }
}
