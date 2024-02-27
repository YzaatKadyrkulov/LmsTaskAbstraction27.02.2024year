public class hexagon extends Shape {
    private double side;

    public hexagon(double side) {
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return 6 * side;
    }
}
