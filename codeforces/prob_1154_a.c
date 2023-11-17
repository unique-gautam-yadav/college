#include <stdio.h>

void sort(int arr[], int n);

int main()
{
    int arr[4];
    scanf("%d %d %d %d", &arr[0], &arr[1], &arr[2], &arr[3]);

    sort(arr, 4);

    int a = arr[0] - arr[3];
    int b = arr[0] - arr[2];
    int c = arr[0] - arr[1];

    printf("%d %d %d\n", a, b, c);

    return 0;
}

void sort(int arr[], int n)
{
    for (int i = 0; i < n - 1; ++i)
    {
        for (int j = 0; j < n - i - 1; ++j)
        {
            if (arr[j] < arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
/*

n1 = a + b
n2 = a + c
n3 = b + c
n4 = a + b + c

*/