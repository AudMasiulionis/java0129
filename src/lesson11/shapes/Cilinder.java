package lesson11.shapes;

public class Cilinder extends Circle {
    private double h;

    public Cilinder(double r, double h){
        super(r);
        this.h = h;
    }

    @Override
    public double getArea(){
        return 2 * super.getArea() +
                this.h * super.getPerimeter();
    }

    public double getVolume(){
        return super.getArea() * this.h;
    }
}
