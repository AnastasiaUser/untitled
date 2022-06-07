public class NestedIfElse {
    public static void main(String[] args) {
        int i = 10, j = 20, k = 20, a = 3, b = 0, c = 4, d = 7;

        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d;
            else a = c;
            System.out.println(a);
        }
        else a = d;
    }
}
