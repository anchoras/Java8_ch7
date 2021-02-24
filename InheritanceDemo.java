/*
    demo program demonstrates basic inheritance in Java
*/

class TwoDShape {
    private double width;
    private double height;

    TwoDShape() {                   // default constructor
        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {           // constructor for figure with even sides
        width = height = x;
    }

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width: " + width + "   Heigth: " + height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    Triangle() {                                //default constructor
        super();
        style = "none";
    }

    Triangle (String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle (double x) {
        super(x);
        style = "Painted over";
    }

    double area() {
        return getWidth() * getHeight() /2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class InheritanceDemo {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("Contour", 8.0, 12.0);
        Triangle t3 = new Triangle(4.5);

        System.out.println("Information about t1: ");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Information about t2: ");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area is: " + t2.area());

        System.out.println();

        System.out.println("Information about t3: ");
        t3.showDim();
        t3.showStyle();
        System.out.println("Area is: " + t3.area());
    }
}