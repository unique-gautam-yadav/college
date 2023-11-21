#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int distances[100];
    for (int i = 0; i < n; ++i)
    {
        scanf("%d", &distances[i]);
    }

    int s, t;
    scanf("%d %d", &s, &t);

    int clockwise_distance = 0;
    for (int i = s; i != t; i = (i % n) + 1)
    {
        clockwise_distance += distances[i - 1];
    }

    long int anticlockwise_distance = 0;
    for (int i = s; i != t; i = (i == 1) ? n : i - 1)
    {
        anticlockwise_distance += distances[i - 2];
    }

    int shortest_distance = (clockwise_distance < anticlockwise_distance) ? clockwise_distance : anticlockwise_distance;

    printf("%d\n", shortest_distance);

    return 0;
}
