#include <stdio.h>

#define COL = 25;
#define ROW = 25;

int main ()
{

    int arr[10] = {1, 2, 3, [10 - 3] = 33, 23};

    int arr1[] = {1, [4] = 2, [1] = 3, 34, 56};

    int arr2[] = {1, 2,3,4,5};

    int arr3[5] = {1,[4] = 2, [1] = 3,4,5};

    int arr4[10] = {1,2, [10-2] = 8,4};

    int arr5[5][5] = {[0][4] = 1, [1][1] = 1, [4] = 1,1};

    int arr6[COL][ROW] = {[COL -1] = 1};

    return 0;
}
