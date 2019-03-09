package com.bondarenkojek;

import com.bondarenkojek.animals.Bird;
import com.bondarenkojek.animals.Fish;
import com.bondarenkojek.animals.Mammal;
import com.bondarenkojek.animals.Penguin;
import com.bondarenkojek.animals.Shark;
import com.bondarenkojek.animals.Sparrow;
import com.bondarenkojek.animals.Tiger;
import com.bondarenkojek.aviaries.Aquarium;
import com.bondarenkojek.aviaries.Aviary;
import com.bondarenkojek.aviaries.AviaryForBird;
import com.bondarenkojek.aviaries.AviaryForMammal;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new KyivZoo();

        Aviary<Mammal> aviary1 = new AviaryForMammal();
        aviary1.addAnimal(new Tiger());
        aviary1.addAnimal(new Tiger());

        Aviary<Bird> aviary2 = new AviaryForBird();
        aviary2.addAnimal(new Sparrow());
        aviary2.addAnimal(new Sparrow());
        aviary2.addAnimal(new Penguin());
        aviary2.addAnimal(new Penguin());

        Aviary<Fish> aviary3 = new Aquarium();
        aviary3.addAnimal(new Shark());
        aviary3.addAnimal(new Shark());

        zoo.addAviary(aviary1);
        zoo.addAviary(aviary2);
        zoo.addAviary(aviary3);

        zoo.feedAllAnimals();
    }
}
