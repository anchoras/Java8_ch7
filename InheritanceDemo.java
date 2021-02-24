/*
    demo program demonstrates basic inheritance in Java
*/

class TwoDShape {
    private double width;
    private double height;

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

    Triangle (String s, double w, double h) {
        style = s;
        setWidth(w);
        setHeight(h);
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
        Triangle t1 = new Triangle("Painted over", 4.0, 4.0);
        Triangle t2 = new Triangle("Conrour", 8.0, 12.0);

        System.out.println("Information about t1: ");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Information about t2: ");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area is: " + t2.area());
    }
}