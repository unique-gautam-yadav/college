#include <stdio.h>

int main()
{
    int k, n, w;
    scanf("%d %d %d", &k, &n, &w);
    int cst = k * (w * (w + 1) / 2);

        int amt = (cst > n) ? cst - n : 0;

    printf("%d\n", amt);

    return 0;
}