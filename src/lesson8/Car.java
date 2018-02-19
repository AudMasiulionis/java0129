package lesson8;

public class Car {
    //fields
    private String color; //null
    private String model;
    private int year; //0
    private int distance;

    //default contructor
    public Car(){
    }

    public Car(String color, String model){
        this.color = color;
        this.model = model;
    }

    //get method
    public String getColor(){
        return this.color;
    }

    //set method
    public void setColor(String color){
        this.color = color;
    }

    public void drive(){
        this.distance++;
    }

    public int getDistance(){
        return this.distance;
    }

}
