#include <stdio.h>
int main() {
	int n,s=0,f,l;
  scanf("%d",&n);
  l = n % 10;
  while(n > 10)
  {
    n = n / 10;
  }
  f = n;
  s=l+f;
  printf("%d",s);
	return 0;
}