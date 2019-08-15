#include<stdio.h>
int n;
int Squ(int n)

{
 int s=n*n;
  return s;
}
int main() {
   int n,sq;
  scanf("%d",&n);
  sq=Squ(n);
  printf("%d",sq);
    
   return 0;
}