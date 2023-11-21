#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    char ticket[51];
    scanf("%s", ticket);

    int first_half_sum = 0;
    int second_half_sum = 0;

    for (int i = 0; i < n; ++i)
    {
        int digit = ticket[i] - '0';
        if (i < n / 2)
        {
            first_half_sum += digit;
        }
        else
        {
            second_half_sum += digit;
        }
    }

    if (first_half_sum == second_half_sum)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
