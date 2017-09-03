/* Given an array of ints of even length, return a new array length 2 containing 
the middle two elements from the original array. The original array will be length 2 or more. */

public int[] makeMiddle(int[] nums) 
{
    if(nums.length>2)
    {
      int i = nums.length / 2;
      return new int[] {nums[i-1],nums[i]};
    }
    return nums;
}