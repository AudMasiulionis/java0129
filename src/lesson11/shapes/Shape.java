package lesson11.shapes;

public class Shape {
    private static int count;

    public Shape() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
