/*
    demo program demonstrates basic inheritance in Java
*/

class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width: " + width + "   Heigth: " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height /2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class InheritanceDemo {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "painted over";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "contour";

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