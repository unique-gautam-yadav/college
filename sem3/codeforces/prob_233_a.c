#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    if (n % 2 == 1)
    {
        printf("-1\n");
    }
    else
    {
        for (int i = 2; i <= n; i += 2)
        {
            printf("%d %d ", i, i - 1);
        }
        printf("\n");
    }

    return 0;
}
