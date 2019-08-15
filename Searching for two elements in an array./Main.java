#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int search1;
  scanf("%d",&search1);
  int search2;
  scanf("%d",&search2);
  int search1_ind=-1;
  int search2_ind=-1;
  for(int i=0;i<n;i++)
  {
    if(search1 == arr[i])
    {
      search1_ind=i;
    }
    if(search2 == arr[i])
    {
      search2_ind=i;
    }
  }
  printf("%d\n",search1_ind);
  printf("%d\n",search2_ind);
  return 0;
}