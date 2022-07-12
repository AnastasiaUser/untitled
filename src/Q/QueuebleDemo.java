package Q;

public class QueuebleDemo {
    public static void main(String[] args) throws QueueEmptyException, QueueFullException {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        DynQueue q3 = new DynQueue(5);
        Queueble ref;
        char ch;
        int i;
        ref = q1;
        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Fixed");

        ref = q2;
        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Circular");
        // adding more values to circular queue
        ref.multiplePut(20, 'M');
        ref.multipleGet(10, "Circular");

        System.out.println("Add symbols  into Circular queue and get them back:");
        for (i =0; i < 20; i++){
            ref.put((char) ('A' + i));
            ch = ref.get();
            System.out.print(ch);
        }
        ref = q3;
        ref.multiplePut(10, 'A');
        ref.multipleGet(10, "Dynamic");
    }
}

