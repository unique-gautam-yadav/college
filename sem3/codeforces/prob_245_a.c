#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int total_a = 0, reached_a = 0, total_b = 0, reached_b = 0;
    for (int i = 0; i < n; i++)
    {
        int t, x, y;
        scanf("%d %d %d", &t, &x, &y);
        if (t == 1)
        {
            total_a += 10;
            reached_a += x;
        }
        else
        {
            total_b += 10;
            reached_b += x;
        }
    }
    printf(reached_a * 2 >= total_a ? "LIVE\n" : "DEAD\n");
    printf(reached_b * 2 >= total_b ? "LIVE\n" : "DEAD\n");
    return 0;
}