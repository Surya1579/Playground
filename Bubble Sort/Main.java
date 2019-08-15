#include <stdio.h>

void bubbleSort(int arr[], int n)
{
    int i, j, temp;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n-i-1; j++)
        {
            if( arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
        }
    }
    for(i = 0; i < n; i++)
    {
        printf("%d\n", arr[i]);
    }
}
int main()
{
    int arr[100], i, n, step, temp;
    scanf("%d", &n);
    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    bubbleSort(arr, n); 
    return 0;
}

#include<stdio.h>

void selectionSort(int a[], int n) 
{
  	int i, j;
    for(i = 0; i < n; i++) 
    {
		int min_idx = i;
		for(j = i; j < n; j++)
		{
			if(a[min_idx] > a[j])
			{
				min_idx = j;
			}
		}
        int tmp = a[i];
		a[i] = a[min_idx];
		a[min_idx] = tmp;
    }
}