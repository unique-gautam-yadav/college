#include <stdio.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int sticks[4];

    for (int i = 0; i < 4; ++i)
    {
        scanf("%d", &sticks[i]);
    }

    for (int i = 0; i < 3; ++i)
    {
        for (int j = 0; j < 3 - i; ++j)
        {
            if (sticks[j] > sticks[j + 1])
            {
                swap(&sticks[j], &sticks[j + 1]);
            }
        }
    }

    if (sticks[0] + sticks[1] > sticks[2] || sticks[1] + sticks[2] > sticks[3])
    {
        printf("TRIANGLE\n");
    }

    else if (sticks[0] + sticks[1] == sticks[2] || sticks[1] + sticks[2] == sticks[3])
    {
        printf("SEGMENT\n");
    }

    else
    {
        printf("IMPOSSIBLE\n");
    }

    return 0;
}
