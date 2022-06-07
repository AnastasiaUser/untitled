
public class LogicalOptTable {
    public static void main(String [] args ) {

        boolean p, q;
        int a, b;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        if (p) a = 1;
        else a = 0;
        if (q) b = 1;
        else b = 0;
        System.out.print(a + "\t" + b + "\t" + (a&b)
                + "\t" + (a|b) + "\t" + (a^b) + "\t");
        if(!p) a = 1;
        else a = 0;
        System.out.println(a);

        p = true; q = false;
        if (p) a = 1;
        else a = 0;
        if (q) b = 1;
        else b = 0;
        System.out.print(a + "\t" + b + "\t" + (a&b)
                + "\t" + (a|b) + "\t" + (a^b) + "\t");
        if(!p) a = 1;
        else a = 0;
        System.out.println(a);


        p = false; q = true;
        if (p) a = 1;
        else a = 0;
        if (q) b = 1;
        else b = 0;
        System.out.print(a + "\t" + b + "\t" + (a&b)
                + "\t" + (a|b) + "\t" + (a^b) + "\t");
        if(!p) a = 1;
        else a = 0;
        System.out.println(a);

        p = false; q = false;
        if (p) a = 1;
        else a = 0;
        if (q) b = 1;
        else b = 0;
        System.out.print(a + "\t" + b + "\t" + (a&b)
                + "\t" + (a|b) + "\t" + (a^b) + "\t");
        if(!p) a = 1;
        else a = 0;
        System.out.println(a);


    }

    }


