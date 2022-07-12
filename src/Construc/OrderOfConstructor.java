package Construc;

public class OrderOfConstructor {
    public static void main(String[] args) {

        Super superObj = new Super();
        Sub1 subObj1 = new Sub1();
        Sub2 subObj2 = new Sub2();

        Super superReference;

        superReference = superObj;
        superReference.who();

        superReference = subObj1;
        superReference.who();

        superReference = subObj2;
        superReference.who();

    }
}
