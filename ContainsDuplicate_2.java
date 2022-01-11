// Leetcode : 219
/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */


package Leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute force approach
        /*int n = nums.length;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n && j<=i+k;j++) {
                if(nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;*/

        // Sliding window technique
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            // If the element found in the set.
            if(set.contains(nums[i])) {
                return true;
            }
            // Add element in the set
            set.add(nums[i]);
            // if size of the set is greater than the window then remove the first added element from the set
            if(set.size()>k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
