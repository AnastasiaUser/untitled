package shapes;

public class Square extends TwoDShape{

    Square(double width) {
        super(width, "square");
    }
    @Override
    double areaCalc() {
        return getWidth() * getWidth();
    }
}
