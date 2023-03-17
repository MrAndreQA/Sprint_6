package ru.yandex.practikum.model;

import ru.yandex.practikum.Predator;
import java.util.List;

public class Cat extends Animal {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() {
        return predator.eatMeat();
    }
}