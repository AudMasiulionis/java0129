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


    public Animal makeAnimal(boolean something){
        if (something){
            return new Animal("123");
        }
        else {
            return new Cat("234");
        }
    }



}
