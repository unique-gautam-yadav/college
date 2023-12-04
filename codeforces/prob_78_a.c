#include <stdio.h>

int main()
{
    char ch[110];
    int syllables[3] = {5, 7, 5};
    int flag = 1;

    for (int i = 0; i < 3; ++i)
    {
        fgets(ch, sizeof(ch), stdin);
        int n = 0;

        for (int j = 0; ch[j] != '\0'; ++j)
        {
            if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u')
            {
                n += 1;
            }
        }

        if (n != syllables[i])
        {
            flag = 0;
        }
    }

    printf("%s\n", (flag ? "YES" : "NO"));
    return 0;
}
