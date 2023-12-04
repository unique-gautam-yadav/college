#include <stdio.h>

int is_prime(int num)
{
    if (num < 2)
    {
        return 0;
    }
    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            return 0;
        }
    }
    return 1;
}

int next_prime(int num)
{
    int next_num = num + 1;
    while (!is_prime(next_num))
    {
        next_num++;
    }
    return next_num;
}

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);

    if (next_prime(n) == m)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
