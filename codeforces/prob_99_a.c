#include <stdio.h>
#include <string.h>

int main()
{
    char number[1001];
    scanf("%s", number);

    int dotPosition = -1;
    for (int i = 0; i < strlen(number); ++i)
    {
        if (number[i] == '.')
        {
            dotPosition = i;
            break;
        }
    }

    char integerPart[dotPosition + 1];
    strncpy(integerPart, number, dotPosition);
    integerPart[dotPosition] = '\0';

    char fractionalPart[1001 - dotPosition];
    strcpy(fractionalPart, number + dotPosition + 1);

    if (integerPart[strlen(integerPart) - 1] != '9')
    {

        if (fractionalPart[0] < '5')
        {
            printf("%s\n", integerPart);
        }
        else
        {

            integerPart[strlen(integerPart) - 1]++;
            printf("%s\n", integerPart);
        }
    }
    else
    {
        printf("GOTO Vasilisa.\n");
    }

    return 0;
}
