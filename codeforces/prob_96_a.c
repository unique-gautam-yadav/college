#include <stdio.h>
#include <string.h>

int main()
{
    char players[101];
    scanf("%s", players);

    int length = strlen(players);
    int count = 1;

    for (int i = 1; i < length; ++i)
    {
        if (players[i] == players[i - 1])
        {
            count++;
            if (count == 7)
            {
                printf("YES\n");
                return 0;
            }
        }
        else
        {
            count = 1;
        }
    }

    printf("NO\n");

    return 0;
}
