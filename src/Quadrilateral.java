public class Quadrilateral extends Shape {
    private double side;

    public Quadrilateral(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
