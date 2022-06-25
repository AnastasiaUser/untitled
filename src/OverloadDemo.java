public class OverloadDemo {
    public static void main(String[] args) {

        Overload ob = new Overload();

        int resI;
        int a = 0;
        int k = 10;
        double c = 8;
        double e = 78;
        float b = 5f;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(a);
        ob.ovlDemo(a, k);
        ob.ovlDemo(c, e);
        resI = ob.ovlDemo(b);
        System.out.println(resI);

        ob.ovlDemo(2);
        ob.ovlDemo(7, 9);
        ob.ovlDemo(7.0, 9.0);
        resI = ob.ovlDemo(7f);
        System.out.println(resI);

    }
}
