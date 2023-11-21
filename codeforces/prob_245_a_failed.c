#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int packets_a = 0, packets_b = 0;

    for (int i = 0; i < n; ++i)
    {
        int t, x, y;
        scanf("%d %d %d", &t, &x, &y);

        if (t == 1)
        {
            packets_a += x;
        }
        else
        {
            packets_b += x;
        }
    }

    if (packets_a >= (n / 2))
    {
        printf("LIVE\n");
    }
    else
    {
        printf("DEAD\n");
    }

    if (packets_b >= (n / 2))
    {
        printf("LIVE\n");
    }
    else
    {
        printf("DEAD\n");
    }

    return 0;
}
