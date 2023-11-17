#include <stdio.h>

int main()
{

    int n, m;

    scanf("%d %d", &m, &n);

    int maxDominos = (m * n) / 2;

    printf("%d\n", maxDominos);

    return 0;
}