public class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer obj = new Outer(x);

        obj.analyze();
    }
}
