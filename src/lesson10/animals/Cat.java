package lesson10.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void protectedToPuplic(){
        super.protectedMethod();
    }

    @Override
    public void makeSound(){
        System.out.println("MEW!");
    }

}
