public class Square implements PerimeterAndArea {

    private int sideA;

    public Square (int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }
}

