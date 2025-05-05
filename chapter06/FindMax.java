package chapter06;

public class FindMax {
    public static void myMax(int... nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 3, 8, 1, 9, 2};
        myMax(nums);
        myMax(3, 6, 7, 2);


    }
}
