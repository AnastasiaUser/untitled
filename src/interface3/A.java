package interface3;

public interface A {
    void method1();
    void method2();

    default int getAdminID() {
        return 1;
    }
    static int getUniversalID() {
        return 0;
    }
}
