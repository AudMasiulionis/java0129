package lesson10;

import lesson10.animals.Animal;
import lesson10.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("name");
        System.out.println(animal.getName());
        System.out.println(animal.toString());

        Cat cat = new Cat("Mice");
        System.out.println(cat.getName());

        new Object();
    }
}
