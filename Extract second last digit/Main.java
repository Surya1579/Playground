#include<stdio.h>
int main()
{
  int n,p,q;
  scanf("%d",&n);
  p=n%100;
  q=p/10;
  printf("%d",q);
  return 0;
}