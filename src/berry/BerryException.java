package berry;

public class BerryException extends Exception {
    String cause;
    BerryException(String cause){
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "Attention! You got BerryException because " + cause + '\'' +
                '}';
    }
}
