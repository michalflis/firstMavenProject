public class Rectangle extends Shape {

    int sideA;
    int sideB;

    public Rectangle (int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }
}
