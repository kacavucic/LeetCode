package com.company;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {

//        while (k > 0) {
//            int last = nums[nums.length - 1];
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = last;
//            k--;
//        }

//        if (nums.length == k) {
//            return;
//        }
//        if (nums.length < k) {
//            k = k % nums.length;
//        }
//        int prvi = nums[0];
//        int kFix = k;
//        for (int j = nums.length - k, i = 0; j < nums.length; j++, i++) {
//            nums[i] = nums[j];
//            for (int z = nums.length - k; z > i + 1; z--) {
//                nums[z] = nums[z - 1];
//            }
//            k--;
//        }
//        nums[kFix] = prvi;

        if (nums.length == k) {
            return;
        }
        if (nums.length < k) {
            k = k % nums.length;
        }

        int[] pom = new int[nums.length];

        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            pom[j] = nums[i];
        }

        for (int i = 0, j = k; i < nums.length - k; i++, j++) {
            pom[j] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = pom[i];
        }

        for (int p = 0; p < nums.length; p++) {
            System.out.println(nums[p]);
        }
        System.out.println();

    }
}
