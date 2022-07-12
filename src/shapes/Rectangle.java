package shapes;

public class Rectangle extends TwoDShape {
    public Rectangle(double width, double height) {
        super(width, height, "rectangle");
    }
    @Override
    double areaCalc() {
        return getWidth() * getHeight();
    }
    boolean isSquare(){
        if (getWidth() == getHeight()) return true;
        return false;
    }
}
