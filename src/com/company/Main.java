package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("сухопутная ",Color.ORANGE);
        pet.Gnaw(2);
        Cat cat = new Cat("ухопутный ",Color.WHITE,new HomePet(" милый дом"));
        cat.Gnaw("диван",1);
        Cat cat1 = new Cat("ухопутный ",Color.BLACK,new HomePet(" сильный дом"));
        cat1.Gnaw("диван",1);
        pet.print();
        cat.print();
        cat1.print();
    }

}