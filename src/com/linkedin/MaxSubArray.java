package com.linkedin;

public class MaxSubArray {

    public int maxSubArray( int[] nums )
    {

        if( nums == null || nums.length == 0 )
            return 0;

        int max = nums[0], maxEnding = nums[0];

        for( int i = 1; i < nums.length; i++ )
        {
            maxEnding = Math.max(nums[i], (maxEnding + nums[i]));
            max = Math.max(maxEnding, max);
        }

        return max;
    }

}
