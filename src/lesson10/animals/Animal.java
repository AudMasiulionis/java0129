package lesson10.animals;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //paveldimas
    public void makeSound(){
        System.out.println("I am an animal!");
    }

    //paveldimas
    protected void protectedMethod(){
        System.out.println("I am protected!");
    }

    //nepaveldimas
    private void secret(){
        System.out.println("Secret");
    }

    @Override
    public String toString() {
        return "Animal name is: " + this.name;
    }
}
