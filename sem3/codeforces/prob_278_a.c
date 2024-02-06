#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int d[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &d[i]);
    }
    int s, t;
    scanf("%d %d", &s, &t);
    if (s > t)
    {
        int temp = s;
        s = t;
        t = temp;
    }
    int clockwise = 0;
    for (int i = s - 1; i < t - 1; i++)
    {
        clockwise += d[i];
    }
    int counterClockwise = 0;
    for (int i = t - 1; i != s - 1; i = (i + 1) % n)
    {
        counterClockwise += d[i];
    }
    int shortest = clockwise < counterClockwise ? clockwise : counterClockwise;
    printf("%d\n", shortest);
    return 0;
}