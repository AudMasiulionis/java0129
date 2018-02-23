package lesson11;

import lesson11.shapes.Cilinder;
import lesson11.shapes.Circle;
import lesson11.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape s1 = new Shape();
        System.out.println(Cilinder.getCount());

        Circle circle = new Circle(3);
        System.out.println(Circle.getCount());

        Cilinder c = new Cilinder(1,2);
        System.out.println(Circle.getCount());

    }
}
