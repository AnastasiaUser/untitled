package shapes;

import shapes.TwoDShape;

    public class Triangle extends TwoDShape {
       private String style;

        Triangle(){
            super();
            this.style = "none";
        }
        Triangle(double x){
            super(x, "triangle");
            this.style = "coloured";
        }
        Triangle(String style, double width, double height){
            super(width, height, "triangle");
            this.style = style;
        }
        double areaCalc() {
            return getWidth() * getHeight() / 2;
        }
        void showStyle() {
            System.out.println("Triangle has style: " );
        }
    }

