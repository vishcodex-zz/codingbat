/* Given three ints, a b c, return true if it is possible to add two of the 
ints to get the third.  */

public boolean twoAsOne(int a, int b, int c) 
{
  int cn=a+b;
  int an=b+c;
  int bn=c+a;
  if(cn==c || an==a || bn==b)
  return true;
  return false;
}