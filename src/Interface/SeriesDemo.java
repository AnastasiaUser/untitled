package Interface;

public class SeriesDemo {
    public static void main(String[] args) {
//        ByTwos ob = new ByTwos();
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Next value is " + ob.getNext());
//        }
//        System.out.println("\nReset:");
//        for (int i = 0; i < 5; i++){
//            System.out.println("Next value is " + ob.getNext());
//        }
//        System.out.println("\nValue to start from:");
//        ob.setStart(100);
//        for (int i = 0; i < 5; i++){
//            System.out.println("Next value is " + ob.getNext());
//        }
//        System.out.println("Previous value: " + ob.getPrevious());

        ByTwos twoObj = new ByTwos();
        ByThrees threeObj = new ByThrees();
        Series obj;

        for (int i = 0; i < 5; i++){
            obj = twoObj;
            System.out.println("Next value of ByTwos object is " + obj.getNext());
            obj = threeObj;
            System.out.println("Next value of ByThrees object is " + obj.getNext());
        }
    }
}
