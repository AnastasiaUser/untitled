package ConstructorsSequency;

public class B extends A {

    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        System.out.println("k: " + k);

    }
//    void method(){
//        System.out.println("NOT ALLOWED");
//    }
}
