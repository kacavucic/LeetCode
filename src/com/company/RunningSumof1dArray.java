package com.company;

public class RunningSumof1dArray {

    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        int helper = 0;
        for (int i = 1; i < nums.length; i++) {
            helper += nums[i];
            runningSum[i] = helper + runningSum[0];
        }
        return runningSum;
    }
}
