package com.linkedin;

/**
 * Search in Rotated Sorted Array Suppose a sorted array is rotated at some pivot unknown to you
 * beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). You are given a target value to
 * search. If found in the array return its index, otherwise return -1. You may assume no duplicate
 * exists in the array.
 *
 */
public class SearchInRotatingArray {

    /**
     * 1. Binary Search 2. if the element is not equal to middle element check if the lowest element
     * is less than or eual to mid
     * 
     */
    public int search( int[] nums, int target )
    {
        int size = nums.length;
        int low = 0;
        int high = size - 1;
        if( size <= 0 )
            return -1;

        while( low <= high )
        {
            int mid = low + (high - low) / 2;
            if( nums[mid] == target )
                return mid;

            if( nums[low] <= nums[mid] )
            {
                if( nums[low] <= target && target < nums[mid] )
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if( nums[high] >= target && target > nums[mid] )
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
