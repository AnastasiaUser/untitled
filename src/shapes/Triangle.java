package shapes;

import shapes.TwoDShape;

    public class Triangle extends TwoDShape {
        String style;
        Triangle(String style, double width, double height){
            super(width,height);
            this.style = style;
        }

        double areaCalc() {
            return getWidth() * getHeight() / 2;
        }
        void showStyle() {
            System.out.println("Triangle has style: " );
        }
    }

