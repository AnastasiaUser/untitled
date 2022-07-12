package Q;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int size) {this.size = size;}

    @Override
    public String toString() {
        return "QueueFullException{" +
                "size=" + size +
                '}';
    }
}

