package lesson12;

public class Person {

    private String vardas;

    public Person(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return vardas != null ? vardas.equals(person.vardas) : person.vardas == null;
    }

    @Override
    public int hashCode() {
        return vardas != null ? vardas.hashCode() : 0;
    }

    @Override
    public String toString(){
        return this.vardas;
    }

}
