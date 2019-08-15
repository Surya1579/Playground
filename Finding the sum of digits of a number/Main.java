#include <stdio.h>
int main() {
	int n,s=0,n1;
	
    scanf("%d",&n);
  while(n>0)
  {
    n1 = n%10;
    s = s + n1;
    n = n/10;

  }
    printf("%d",s);
    return 0;
}
