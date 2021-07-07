public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {

             return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - sideA ) * (getPerimeter() / 2 - sideB ) * (getPerimeter() / 2 - sideC ));

        }

    @Override
    public double getPerimeter() {

            return sideA + sideB + sideC;

    }

}
