#include <stdio.h>

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);

    int totalChips = n * (n + 1) / 2;

    int rounds = m / totalChips;

    int remainingChips = m % totalChips;

    for (int i = 1; i <= n; i++)
    {
        if (remainingChips < i)
        {
            printf("%d\n", remainingChips);
            return 0;
        }
        remainingChips -= i;
    }

    printf("0\n");

    return 0;
}
