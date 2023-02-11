package com.company;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = {12, 14, 35, 61, 92, 124};
        int target = 150;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
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
        return startIndex;
    }
}
