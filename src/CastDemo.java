public class CastDemo {
    public static void main(String[] args) {
//        int i;
//        float f;
//
//        i = 10;
//        f = 340.7f;
//
//        long l;
//        long d;
//
//        d = 100123285L;
//        l = d;// втоматически произошло преобразование типа long b double
//        System.out.println("L & 0: " + l + " " + d);


        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int)(x/y);
        System.out.println(i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 258;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b  = 88;
        ch = (char) b;
        System.out.println("ch:" + ch);


    }
}
