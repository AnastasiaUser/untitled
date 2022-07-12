package PackInterface;

public class Journal extends Book{
    public Journal(String t, String a, int pD) {
        super(t, a, pD);
    }


    public void demonstrateAcessibility() {
        System.out.println(super.number1 + "it is public and it is ");
        System.out.println(super.number2 + "it is default and it is ");
        System.out.println(super.number3 + "it is protected and it is ");
        System.out.println(super.number4 + "it is private and it is ");

        super.showPublic();
        super.showProtected();
    }

}
