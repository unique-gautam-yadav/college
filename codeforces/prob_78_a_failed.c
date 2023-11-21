#include <stdio.h>
#include <ctype.h>

int countVowels(char *str)
{
    int count = 0;
    while (*str)
    {
        char c = tolower(*str);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            count++;
        }
        str++;
    }
    return count;
}

int main()
{
    char phrases[3][101];

    for (int i = 0; i < 3; i++)
    {
        fgets(phrases[i], sizeof(phrases[i]), stdin);
    }

    if (countVowels(phrases[0]) == 5 && countVowels(phrases[1]) == 7 && countVowels(phrases[2]) == 5)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }

    return 0;
}
