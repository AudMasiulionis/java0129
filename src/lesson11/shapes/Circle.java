package lesson11.shapes;

public class Circle extends Shape {
    private double r;
    public static double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    public double getPerimeter(){
        return PI * 2 * r;
    }

    public static String getName(){
        return "Circle";
    }

}
