package shapes;

public class TwoDShape {
   private double width;
   private double height;

   TwoDShape (double width, double height){
       setWidth(width);
       setHeight(height);
   }
    double getWidth(){
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double width){
        this.width = width;
        System.out.println("width set succesful");
    }
    void setHeight(double height){
        this.height = height;
        System.out.println("height set succesful");
    }

    void showDim() {
        System.out.println("width and height: " + width + " and " + height);
    }
}
