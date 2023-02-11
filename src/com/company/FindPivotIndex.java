package com.company;

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {
        int pivotIndex = -1;

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                leftSum += nums[i - 1];
            }
            if (i != nums.length - 1) {
                for (int j = nums.length - 1; j > i; j--) {
                    rightSum += nums[j];
                }
            }
            if (leftSum == rightSum) {
                pivotIndex = i;
                return pivotIndex;
            }
            rightSum = 0;
        }

        return pivotIndex;
    }
}
