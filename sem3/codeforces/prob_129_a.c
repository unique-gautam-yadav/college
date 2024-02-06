#include <stdio.h>

int main()
{
    int n, a, odd = 0, even = 0;
    scanf("%d", &n);

    while (n--)
    {
        scanf("%d", &a);
        if (a % 2 == 0)
        {
            even += 1;
        }
        else
        {
            odd += 1;
        }
    }

    printf("%d\n", (odd % 2 == 1 ? odd : even));
    return 0;
}
