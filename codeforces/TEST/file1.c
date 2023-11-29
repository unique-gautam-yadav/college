#include <stdio.h>

int isStableNumber(int num);

int main()
{

    int nums[4] = {2222, 2021, 1010, 8898};

    int stables = 0;
    int unStables = 0;

    for (int i = 0; i < 4; i++)
    {
        if (isStableNumber(nums[i]))
        {
            stables += nums[i];
        }
        else
        {
            unStables += nums[i];
        }
    }

    int diff = stables - unStables;

    printf("Answer = %d\n", diff);

    return 0;
}

int isStableNumber(int num)
{
    int count[10] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int act = num;

    while (num > 0)
    {
        count[num % 10]++;
        num /= 10;
    }

    num = act;
    int ff = count[num % 10];

    int isStable = 1;

    while (num > 0)
    {
        if (ff != count[num % 10])
        {
            isStable = 0;
            break;
        }

        num /= 10;
    }

    return isStable;
}
