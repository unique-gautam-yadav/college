#include <stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int n;
        scanf("%d", &n);

        int ways = (n - 1) / 2;

        printf("%d\n", ways);
    }

    return 0;
}
