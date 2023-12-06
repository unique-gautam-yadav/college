#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

int main()
{
    int n, a, b;
    scanf("%d%d%d", &n, &a, &b);

    int *h = malloc(n * sizeof(int));

    for (int i = 0; i < n; ++i)
        scanf("%d", &h[i]);

    qsort(h, n, sizeof(int), compare);

    int ways = h[b] - h[b - 1];

    printf("%d\n", ways);

    free(h);

    return 0;
}
