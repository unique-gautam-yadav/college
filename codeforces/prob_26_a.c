#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int c1 = 0;
    int carr[3001] = {0};

    for (int i = 2; i <= n; ++i)
    {
        if (carr[i] == 0)
        {

            for (int j = i; j <= n; j += i)
            {
                carr[j]++;
            }
        }
    }

    for (int i = 2; i <= n; ++i)
    {
        if (carr[i] == 2)
        {
            c1++;
        }
    }

    printf("%d\n", c1);

    return 0;
}
