#include <stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int a, b;
        scanf("%d %d", &a, &b);
        int remainder = a % b;
        int moves = (remainder == 0) ? 0 : (b - remainder);

        printf("%d\n", moves);
    }

    return 0;
}
