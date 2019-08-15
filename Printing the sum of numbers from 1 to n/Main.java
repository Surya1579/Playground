#include <stdio.h>
int main() {
	int n,c,s=0;
  scanf("%d",&n);
  for(c=1;c<=n;c++)
  {
    s=s+c;
  }
  printf("%d",s);
	return 0;
}