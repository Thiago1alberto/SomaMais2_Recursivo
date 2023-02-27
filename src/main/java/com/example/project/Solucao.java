package com.example.project;

public class Solucao {
    public int[] somaDois(int[] nums, int target) {
        return somaDoisrecursivo(nums, target, 0, nums.length - 1);
    }

    private int[] somaDoisrecursivo(int[] nums, int target, int left, int right) {
        if (left >= right) {
            return new int[] { -1, -1 };
        }
        int mid = (left + right) / 2;
        if (nums[mid] + nums[left] == target) {
            return new int[] { nums[left], nums[mid] };
        }
        if (nums[mid + 1] + nums[left] == target) {
            return new int[] { nums[left], nums[mid + 1] };
        }
        if (nums[mid] + nums[right] == target) {
            return new int[] { nums[mid], nums[right] };
        }
        if (nums[mid - 1] + nums[right] == target) {
            return new int[] { nums[mid - 1], nums[right] };
        }
        if (nums[mid] + nums[left] < target) {
            return somaDoisrecursivo(nums, target, left + 1, right);
        } else {
            return somaDoisrecursivo(nums, target, left, right - 1);
        }
    }
}
