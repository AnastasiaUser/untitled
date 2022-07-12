package interface2;

public class Implementation implements IConst {
    public static void main(String[] args) {
        int num[] = new int[MAX];

        for (int i = MIN; i<11; i++){
            if (i>=MAX) System.out.println(ERRORMSG);
            else {
                num[i] = i;
                System.out.print(num[i] + " ");
            }
        }

    }
}
