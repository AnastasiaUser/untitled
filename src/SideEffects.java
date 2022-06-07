public class SideEffects {
    public static void main(String[] args) {
        int i = 0;

        if (true || (++i < 100))
            System.out.println("this string is not displayed");
        System.out.println("if operator is executed case 1: " + i);

        if (true | (++i < 100))
            System.out.println("this string is not displayed");
        System.out.println("if operator is executed case 2: " + i);


        int thisNumber = 0;

        if (true | false) System.out.println("this should be printed");
        if (true | (++thisNumber > 0)) System.out.println("2 this should be printed and thisNumber is" + thisNumber);
        if (true || (++thisNumber > 0)) System.out.println("3 this should be printed and thisNumber is" + thisNumber);
        if (true || false) System.out.println("4 this should be printed");
        if (true & false) System.out.println("5 this should NOT!!!!!!! be printed");
        if (true & (++thisNumber > 0))
            System.out.println("6 this should be printed BECAUSE thisNumber is" + thisNumber);
        if (true && false) System.out.println("7 this should NOT!!!!!!! be printed");
        if (true && (++thisNumber > 4))
            System.out.println("8 this should be printed BECAUSE thisNumber is" + thisNumber);

        if (true ^ false) System.out.println("9 this should be printed");
        if (true) System.out.println("10 this should NOT!!!!!!! be printed");
        if (false) System.out.println("11 this should be printed");

        if (true | false) System.out.println("12 this should be printed");
        if (true | false) System.out.println("13 this should be printed BECAUSE thisNumber is" + thisNumber);
        if (true || false) System.out.println("14 this should be printed");
        if (true || false) System.out.println("15 this should be printed BECAUSE thisNumber is" + thisNumber);
        if (true & false) System.out.println("16 this should NOT!!!!!!! be printed");
        if (true & false) System.out.println("17 this should NOT!!!!!!! be printed but thisNumber is" + thisNumber);
        if (true && false) System.out.println("18 this should NOT!!!!!!! be printed");
        if (true && false) System.out.println("19 this should NOT!!!!!!! be printed");
        if (true ^ false) System.out.println("20 this should be printed");


    }
     }

