#include <stdio.h>

int main()
{
    char matrix[3][4];

    for (int i = 0; i < 3; ++i)
    {
        scanf("%s", matrix[i]);
    }

    if (matrix[0][0] == matrix[2][2] && matrix[0][1] == matrix[2][1] && matrix[0][2] == matrix[2][0] &&
        matrix[1][0] == matrix[1][2])
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
