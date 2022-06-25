public class Overload {
    void ovlDemo() {
        System.out.println("no parameters");

    }
    void ovlDemo(int a) {
        System.out.println("One parameters: " + a);

    }
    void ovlDemo(int a1, int b1) {
        System.out.println("Two parameters of type integer: " + a1 +" " + b1);
    }
    void ovlDemo(double a2, double b2) {
        System.out.println("Two parameters of type double: " + a2 +" " + b2);
    }

    int ovlDemo(float a) {
        System.out.println("One parameters of type float: " + a);
        return (int)a;

    }
}
