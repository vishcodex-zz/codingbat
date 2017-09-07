/* Return true if the given non-negative number is 1 or 2 more than a 
multiple of 20. See also: Introduction to Mod  */

public boolean more20(int n) 
{
  if(n%20 == 0)
  return false;
  if(n%20 ==1 || n%20 ==2)
  return true;
  return false;
}