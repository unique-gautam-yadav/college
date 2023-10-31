#include <stdio.h>

int main()
{
    int n1, n2, n3, n4, a, b, c;

    scanf("%d %d %d %d", &n1, &n2, &n3, &n4);

    int max = n1;

    if (max > n2)
    {
        max = n2;
    }
    if (max > n3)
    {
        max = n3;
    }
    if (max > n4)
    {
        max = n4;
    }

    printf("%d", max);
}