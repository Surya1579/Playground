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
     int max;
        if(arr[0]<arr[1])
          {
           max=arr[1];
          }
        else 
          {
            max=arr[0];
          }
  for(int i=2;i<n;i++)
  {
    if(max<arr[i])
    {
     max=arr[i];
    }
  }
      printf("%d",max);
  return 0;
}