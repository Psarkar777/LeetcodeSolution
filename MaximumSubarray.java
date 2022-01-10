// Leetcode : 53

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 */


package Leetcode;

import java.util.Scanner;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums) {
            sum += num;
            ans = Math.max(sum, ans);
            sum = Math.max(sum, 0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(maxSubArray(nums));
            t--;
        }
    }
}
