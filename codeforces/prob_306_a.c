#include <stdio.h>

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);

    int candies_per_friend = n / m;
    int extra_candies = n % m;

    for (int i = 0; i < m; ++i)
    {
        if (i < extra_candies)
        {
            printf("%d ", candies_per_friend + 1);
        }
        else
        {
            printf("%d ", candies_per_friend);
        }
    }

    return 0;
}
