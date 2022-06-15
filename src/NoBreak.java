public class NoBreak {

        public static void main (String[]args){
//        int i;
//
//        for (i = 0; i <= 5; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("i меньше нулю");
//                case 1:
//                    System.out.println("i меньше единице");
//                case 2:
//                    System.out.println("i меньше двум");
//                case 3:
//                    System.out.println("i меньше трём");
//                case 4:
//                    System.out.println("i меньше четырём");
//                default:
//                    System.out.println("дефолтный оператор");
//            }
//            System.out.println();
//        }
//    }
//
//    }


    int z = 2;
    switch (z) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5: System.out.println("будний день");
        case 6:
        case 7: System.out.println("выходной");
        break;
        default:
              System.out.println("это не день недели");

        }

        char ch1 = 'A';
        char ch2 = 'A';

        switch (ch1) {
            case 'A':
                System.out.println("Это раздел А внешнего оператора свитч");
                switch (ch2) {
                    case 'A':
                        System.out.println("Это раздел А внутреннего оператора свитч");
                        break;
                }
                break;
            case 'B': System.out.println("Это раздел B внешнего oператора свитч");
            break;
        }
        }
        }


