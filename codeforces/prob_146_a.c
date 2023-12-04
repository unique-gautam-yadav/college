#include <stdio.h>

int main()
{
    size_t n;
    scanf("%lu", &n);

    char s[n + 1];
    scanf("%s", s);

    int lucky = 1;
    int diff = 0;
    n /= 2;
    for (size_t i = 0; i < n; ++i)
    {
        if ((s[i] != '4' && s[i] != '7') || (s[n + i] != '4' && s[n + i] != '7'))
        {
            lucky = 0;
            break;
        }
        diff += (s[i] - s[n + i]);
    }

    lucky = lucky && (diff == 0);
    printf("%s\n", (lucky ? "YES" : "NO"));

    return 0;
}
