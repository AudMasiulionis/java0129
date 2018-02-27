package lesson12.fruit;

import java.util.ArrayList;

public class BasicBasket {
    public static final int MAX_CAPACITY = 10;
    private ArrayList<String> apples = new ArrayList<>();

    public void addApple(String appleName){
        this.apples.add(appleName);
    }

    public int appleCount(){
        return this.apples.size();
    }

    public boolean isFull(){
        return this.apples.size() == this.MAX_CAPACITY;
    }

    public void clear(){
        this.apples.clear();
    }
}
