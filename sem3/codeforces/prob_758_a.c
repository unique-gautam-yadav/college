#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int n;
    scanf("%d", &n);

    int ma = 0;
    int total = 0;

    for (int i = 0; i < n; ++i)
    {
        int m;
        scanf("%d", &m);

        if (m > ma)
        {
            ma = m;
        }

        total += m;
    }

    total -= ma * n;

    total = abs(total);

    printf("%d\n", total);

    return 0;
}
