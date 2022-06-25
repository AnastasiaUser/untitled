public class Outer {
    int nums[];

    Outer(int[] num) {
        this.nums = nums;
    }
    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Min: " + inOb.min());
        System.out.println("Max: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }
        class Inner {
            int min() {
                int m = nums[0];
                for (int i = 1; i < nums.length; i++)
                    if (nums[i] < m) m = nums[i];
                    return m;
                }

                int max () {
                    int m = nums[0];
                    for (int i = 1; i < nums.length; i++)
                        if (nums[i] > m) m = nums[i];
                        return m;
                    }

                    int avg () {
                        int a = 0;
                        for (int i = 1; i < nums.length; i++)
                            a += nums[i];
                        System.out.println(a);
                        System.out.println(nums.length);
                        return a / nums.length;

                    }
                }
            }

