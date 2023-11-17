#include <stdio.h>

int gcd(int a, int b)
{
    if (b == 0)
    {
        return a;
    }
    return gcd(b, a % b);
}

int main()
{
    int y, w;
    scanf("%d %d", &y, &w);

    int maxDot = 6 - (y > w ? y : w) + 1;

    int commonDivisor = gcd(maxDot, 6);

    printf("%d/%d\n", maxDot / commonDivisor, 6 / commonDivisor);

    return 0;
}
