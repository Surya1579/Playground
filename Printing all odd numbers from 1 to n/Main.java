#include <stdio.h>
int main() {
	int n,c;
  scanf("%d",&n);
  for(c=1;c<=n;c++)
  {
    if(c%2==1)
    {
      printf("%d\n",c);
    }
  }
	return 0;
}