public class Calculate {
    public class Calculator {
        public static void main(String[] args) {
            double[] nums = {0, 20, 30, 105, 350, 100000};
            double result = 0;

            for (double s : nums) {
                result += s;
            }
            System.out.println("Среднее арифметическое " + result / nums.length);
        }
    }

}
