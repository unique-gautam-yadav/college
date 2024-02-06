#include <stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int n;
        scanf("%d", &n);

        int roundNumbers[10];
        int count = 0;
        int multiplier = 1;

        while (n > 0)
        {
            int digit = n % 10;
            if (digit > 0)
            {
                roundNumbers[count++] = digit * multiplier;
            }
            n /= 10;
            multiplier *= 10;
        }

        printf("%d\n", count);
        for (int i = 0; i < count; ++i)
        {
            printf("%d ", roundNumbers[i]);
        }
        printf("\n");
    }

    return 0;
}
