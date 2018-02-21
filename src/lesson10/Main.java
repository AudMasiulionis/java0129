package lesson10;

import lesson10.animals.Animal;
import lesson10.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat a = new Cat("name");
        Animal animal = a.makeAnimal(true);

        if (animal instanceof Animal){
            System.out.println("Animal");
        }
        if(animal instanceof Cat){
            System.out.println("Cat");
            Cat cat = (Cat)animal;
        }

    }
}
