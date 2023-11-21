#include <stdio.h>
#include<math.h>

int main()
{
    int n;
    scanf("%d", &n);

    int heights[1000];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &heights[i]);
    }

    int minDiff = 1001;
    int soldier1, soldier2;

    for (int i = 0; i < n; i++)
    {
        int diff = abs(heights[i] - heights[(i + 1) % n]);
        if (diff < minDiff)
        {
            minDiff = diff;
            soldier1 = i + 1;
            soldier2 = (i + 1) % n + 1;
        }
    }

    printf("%d %d\n", soldier1, soldier2);

    return 0;
}
