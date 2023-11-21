#include <stdio.h>

int min_exams_to_resit(int n, int k)
{
    int min_exams_to_resit = (2 * n - k) > 0 ? (2 * n - k) : 0;

    return min_exams_to_resit;
}

int main()
{
    int n, k;
    scanf("%d %d", &n, &k);

    printf("%d\n", min_exams_to_resit(n, k));

    return 0;
}
