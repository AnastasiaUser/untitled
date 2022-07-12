package Q;

public class QueueEmptyException extends Exception{

    @Override
    public String toString() {
        return "\nThe queue is empty.";
    }
}
