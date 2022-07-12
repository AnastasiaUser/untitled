package Q;

public interface Queueble {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
    default void multiplePut(int numberOfTimes, char startingFrom) {
        for (int i = 0; i < numberOfTimes; i++){
            try {
                put((char) (startingFrom + i));
            } catch (QueueFullException e) {
                System.out.println("QueueFullException has occurred.");
            }
        }
    }
    default void multipleGet(int numberOfTimes, String n) {
        System.out.println("\n" + n + " queue contains:");
        for (int i =0; i < numberOfTimes; i++){
            try {
                char ch = get();
                System.out.print(ch);
            } catch (QueueEmptyException e) {
                System.out.println("QueueEmptyException has occurred.");
            }
        }
        System.out.println("\n");
    }
}
