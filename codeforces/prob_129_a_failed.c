#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int cookies[100];
    int even_count = 0;

    for (int i = 0; i < n; ++i)
    {
        scanf("%d", &cookies[i]);
        if (cookies[i] % 2 == 0)
        {
            even_count++;
        }
    }

    int ways = 0;
    for (int i = 0; i < n; ++i)
    {
        if (cookies[i] % 2 == 1 && even_count > 0)
        {
            ways++;
            break;
        }
    }

    printf("%d\n", ways);

    return 0;
}
