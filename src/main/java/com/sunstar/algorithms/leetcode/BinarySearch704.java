package com.sunstar.algorithms.leetcode;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while (lo<=hi){
            int mid = lo + (hi-lo) / 2;
            if(target<nums[mid]){
                hi=mid-1;
            }else if(target>nums[mid]){
                lo=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
