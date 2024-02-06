#include <stdio.h>

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    int differentSocks = (a < b) ? a : b;

    int sameSocks = (a - differentSocks + b - differentSocks) / 2;

    printf("%d %d\n", differentSocks, sameSocks);

    return 0;
}
