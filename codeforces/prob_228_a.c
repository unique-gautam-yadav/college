#include <stdio.h>

int main()
{
    int s1, s2, s3, s4;
    scanf("%d %d %d %d", &s1, &s2, &s3, &s4);

    int colors[4] = {s1, s2, s3, s4};
    int distinct_colors = 1;

    for (int i = 1; i < 4; ++i)
    {
        int j;
        for (j = 0; j < i; ++j)
        {
            if (colors[i] == colors[j])
            {
                break;
            }
        }
        if (i == j)
        {
            distinct_colors++;
        }
    }

    int min_horseshoes_to_buy = 4 - distinct_colors;

    printf("%d\n", min_horseshoes_to_buy);

    return 0;
}
