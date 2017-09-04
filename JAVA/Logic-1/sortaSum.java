/* Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
inclusive, are forbidden, so in that case just return 20. */

public int sortaSum(int a, int b) 
{
  int s = a+b;
  if(s>=10 && s<=19)
  return 20;
  else
  return a+b;
}
