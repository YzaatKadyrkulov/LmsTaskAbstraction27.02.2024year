public class Pentagon extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double side5;

    public Pentagon(double side1, double side2, double side3, double side4, double side5) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
    }


    @Override
    public double getPerimeter() {
        return side1+ side2+ side3+ side4+ side5;
    }
}
