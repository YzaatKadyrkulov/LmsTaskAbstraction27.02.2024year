
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task of teacher
         * Deadline : 28.02.2024 / 17:00
         * public abstract double getPerimeter()
         *
         * деген абстракт методун  Shape деген класска кошунуз.
         *
         * Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.
         */
        Circle circle = new Circle(5);

        Quadrilateral quadrilateral = new Quadrilateral(6);

        Triangle triangle = new Triangle(3, 4, 5);

        Pentagon pentagon = new Pentagon(1,2,3,4,5);

        hexagon hexagon = new hexagon(10);

        System.out.println("Circle = " + circle.getPerimeter());
        System.out.println("Quadrilateral = " + quadrilateral.getPerimeter());
        System.out.println("Triangle = " + triangle.getPerimeter());
        System.out.println("Pentagon = " + pentagon.getPerimeter());
        System.out.println("hexagon = " + hexagon.getPerimeter());




    }
}