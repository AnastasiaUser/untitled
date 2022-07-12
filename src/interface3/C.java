package interface3;

public class C implements A, B{
    @Override
    public void method1() {
        System.out.println("method1 realization");
    }
    @Override
    public void method2() {
        System.out.println("method2 realization");
    }
    @Override
    public void method3() {
        System.out.println("method3 realization");
    }

    @Override
    public int getAdminID() {
        return 129;
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.method1();
        obj.method2();
        obj.method3();
        System.out.println(obj.getAdminID());

        int uID = A.getUniversalID();
    }
}
