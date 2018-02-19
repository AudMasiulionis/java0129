package lesson8;

public class Point {
    private int x;
    private int y;
    private String color;

    public Point(){
        this.x = 6;
        this.y = 6;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance() {
        double sum = Math.pow(this.x, 2) +
                Math.pow(this.y, 2);

        return Math.sqrt(sum);
    }

    public int getCartesian() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        }
        if (this.x < 0 && this.y > 0) {
            return 2;
        }
        if (this.x < 0 && this.y < 0) {
            return 3;
        }
        if (this.x > 0 && this.y < 0) {
            return 4;
        }
        return 0;
    }

    public boolean sameCartesian(Point point){
        return this.getCartesian() == point.getCartesian();
    }

    @Override
    public boolean equals(Object other){
        Point o = (Point)other;
        return this.x == o.x && this.y == o.y;
    }

}
