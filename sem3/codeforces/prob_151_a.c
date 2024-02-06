#include <stdio.h>

int main()
{
    int n, k, l, c, d, p, nl, np;
    scanf("%d %d %d %d %d %d %d %d", &n, &k, &l, &c, &d, &p, &nl, &np);

    int drink_limit = (k * l) / nl;
    int lime_limit = (c * d);
    int salt_limit = p / np;

    int toasts = (drink_limit < lime_limit) ? drink_limit : lime_limit;
    toasts = (toasts < salt_limit) ? toasts : salt_limit;

    int result = toasts / n;

    printf("%d\n", result);

    return 0;
}
