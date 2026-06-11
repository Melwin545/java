abstract class ShapeBase {
    double area;
    abstract void calc();
}

class Circle extends ShapeBase{
    int r;

    Circle(int r) {
        this.r = r;
    }

    void calc() {
        area = 3.14 * r * r;
        System.out.println("Area = " + area);
    }
}

public class Shape {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        c.calc();
    }
}