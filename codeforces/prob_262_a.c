#include <stdio.h>

int count_lucky_digits(int num)
{
    int count = 0;
    while (num > 0)
    {
        int digit = num % 10;
        if (digit == 4 || digit == 7)
        {
            count++;
        }
        num /= 10;
    }
    return count;
}

int main()
{
    int n, k;
    scanf("%d %d", &n, &k);

    int ai;
    int count = 0;

    for (int i = 0; i < n; ++i)
    {
        scanf("%d", &ai);
        if (count_lucky_digits(ai) <= k)
        {
            count++;
        }
    }

    printf("%d\n", count);

    return 0;
}
