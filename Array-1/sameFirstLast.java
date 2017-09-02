/* Given an array of ints, return true if the array is length 1 or more, 
and the first element and the last element are equal. */

public boolean sameFirstLast(int[] nums) 
{
  if(nums.length >=1)
  {
    for(int i=0;i< nums.length-1;i++)
    if(nums[0] == nums [nums.length-1])
    return true;
  }
  if(nums.length == 1)
  return true;
  return false;
}


or

public boolean sameFirstLast(int[] nums) {
    return nums.length > 0 && nums[0] == nums[nums.length - 1];
}