package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + ((endIndex - startIndex) / 2);
            if (nums[middleIndex] > target) {
                endIndex = middleIndex - 1;
            }
            else if (nums[middleIndex] < target) {
                startIndex = middleIndex + 1;
            }
            else {
                return middleIndex;
            }
        }
        return -1;
    }
}
