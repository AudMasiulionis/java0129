package lesson12.fruit;

import java.util.ArrayList;

public class Basket {
    public static final int MAX_CAPACITY = 10;
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        if (this.isFull()){
            return;
        }
        this.fruits.add(fruit);
    }

    public int fruitCount() {
        return this.fruits.size();
    }

    public boolean isFull() {
        return this.fruits.size() == this.MAX_CAPACITY;
    }

    public void clear() {
        this.fruits.clear();
    }

    @Override
    public String toString() {
        int appleCount = 0;
        int orangeCount = 0;
        int otherFruitCount = 0;

        for (Fruit fruit : this.fruits) {
            if (fruit instanceof Apple) {
                appleCount++;
            } else if (fruit instanceof Orange) {
                orangeCount++;
            } else {
                otherFruitCount++;
            }
        }

        return String.format("Basket contains:" +
                        "\n%d apples" +
                        "\n%d oranges" +
                        "\n%d other fruit.",
                appleCount, orangeCount, otherFruitCount);
    }

}
