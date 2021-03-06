public class RightTriangle {

    int a;
    int b;
    int c;

    public RightTriangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean isTriangleRight(int a, int b, int c) {
        return (a * a) + (b * b) == (c * c);
    }

}
