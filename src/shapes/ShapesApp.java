package shapes;

public class ShapesApp {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "contoured", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "coloured", 2.0, 2.0);

        System.out.println("Refernce on t1:");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.areaCalc());

        System.out.println();

        System.out.println("Refernce on t2:");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.areaCalc());

        TwoDShape shapes[] = new TwoDShape[4];
        shapes[0] = new Triangle("contour", 8.0, 12.0);
        shapes[1] = new Rectangle(8.0, 12.0);
        shapes[2] = new Square(2.0);
        shapes[3] = new ColorTriangle("yellow", "contour", 8.0, 12.0);

        System.out.println("---------------------------------------------");

        for (TwoDShape shape: shapes) {
            System.out.println(shape.getClass());
            System.out.println(shape.getName());
            System.out.println("Area is equal to " + shape.areaCalc()+ "\n");
        }
    }
}
