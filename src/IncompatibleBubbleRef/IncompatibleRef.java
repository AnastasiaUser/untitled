package IncompatibleBubbleRef;

public class IncompatibleRef {
    public static void main(String[] args) {
//        X = new X(10);
//        Y x2;
//
//        Y = new Y(5,6);
//
//        x2 = y;
//        System.out.println("x2.a: " + x2.a);
//        System.out.println("x2.a: " + x2.a);
//
//        x2.a = 19;
//        x2 = y;


        X thisIsAnObjectOfTypeX = new X(10);
        Y thisIsAnObjectOfTypeY = new Y(10, 7);

        X thisIsAVariableOfTypeX;

        thisIsAVariableOfTypeX = thisIsAnObjectOfTypeY;

        thisIsAVariableOfTypeX.a = 11;
//        thisIsAVariableOfTypeX.b = 11;
    }
}

