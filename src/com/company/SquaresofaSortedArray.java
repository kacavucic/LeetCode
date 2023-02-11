package com.company;

public class SquaresofaSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int pom = nums[i];
                nums[i] = nums[min];
                nums[min] = pom;
            }
        }
        return nums;


    }
}
