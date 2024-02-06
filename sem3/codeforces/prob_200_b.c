#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    double frac = 0.0;

    for (int i = 0; i < n; i++)
    {
        int m;

        scanf("%d", &m);

        frac += m;
    }

    double tail = frac / n;

    printf("%lf\n", tail);

    return 0;
}
